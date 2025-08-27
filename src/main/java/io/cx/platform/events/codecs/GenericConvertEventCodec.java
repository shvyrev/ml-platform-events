package io.cx.platform.events.codecs;

import io.cx.platform.events.BaseEvent;
import io.cx.platform.events.BaseEventCodec;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.Json;

import java.util.function.Function;

public class GenericConvertEventCodec<V, T extends BaseEvent> extends BaseEventCodec<V, T> {

    private final Class<V> vClass;
    private final Class<T> tClass;
    private final Function<V, T> transformFunc;

    public GenericConvertEventCodec(Class<V> vClass, Class<T> tClass, Function<V, T> transformFunction) {
        this.vClass = vClass;
        this.tClass = tClass;
        this.transformFunc = transformFunction;
    }

    @Override
    public T decodeFromWire(int pos, Buffer buffer) {
        try {
            V decoded = Json.decodeValue(buffer.getBuffer(pos, buffer.length() - pos), vClass);
            return transform(decoded);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to decode JSON to event type: " + tClass.getSimpleName(), e);
        }
    }

    @Override
    public T transform(V v) {
        return transformFunc.apply(v);
    }

    @Override
    public String name() {
        return vClass.getSimpleName() + "To" + tClass.getSimpleName() + "Codec";
    }
}