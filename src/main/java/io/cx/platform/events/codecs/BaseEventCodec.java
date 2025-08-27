package io.cx.platform.events.codecs;

import io.cx.platform.events.BaseEvent;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.core.json.Json;

public abstract class BaseEventCodec<V, T extends BaseEvent> implements MessageCodec<V, T> {

    @Override
    public void encodeToWire(Buffer buffer, V v) {
        buffer.appendBuffer(Json.encodeToBuffer(v));
    }

    @Override
    public byte systemCodecID() {
        return -1;
    }
}