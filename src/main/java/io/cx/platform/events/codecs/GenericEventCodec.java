package io.cx.platform.events.codecs;

import io.cx.platform.events.BaseEvent;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.Json;

import static io.cx.platform.events.EventsRegistry.getCodecName;

public class GenericEventCodec<T extends BaseEvent> extends BaseEventCodec<T, T> {

    private final Class<T> eventClass;

    public GenericEventCodec(Class<T> eventClass) {
        this.eventClass = eventClass;
    }

    @Override
    public T decodeFromWire(int pos, Buffer buffer) {
        try {
            return Json.decodeValue(buffer.getBuffer(pos, buffer.length() - pos), eventClass);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to decode JSON to event type: " + eventClass.getSimpleName(), e);
        }
    }

    @Override
    public T transform(T s) {
        return s;
    }

    @Override
    public String name() {
        return getCodecName(eventClass);
    }
}