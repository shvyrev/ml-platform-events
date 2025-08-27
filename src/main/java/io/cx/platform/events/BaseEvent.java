package io.cx.platform.events;

import io.vertx.core.json.JsonObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@Getter
@EqualsAndHashCode
@ToString
public abstract class BaseEvent {
    private final UUID eventId;
    private final Instant timestamp;
    private final String eventType;

    public BaseEvent() {
        this.eventId = UUID.randomUUID();
        this.timestamp = Instant.now();
        this.eventType = this.getClass().getSimpleName();
    }

    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }
}