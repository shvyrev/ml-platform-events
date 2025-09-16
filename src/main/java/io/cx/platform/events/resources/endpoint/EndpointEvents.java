package io.cx.platform.events.resources.endpoint;

import io.cx.platform.events.BaseEvent;
import lombok.Getter;

import java.util.UUID;

@Getter
public sealed class EndpointEvents extends BaseEvent permits EndpointCreated, EndpointUpdated, EndpointDeleted {
    private final UUID endpointId;

    public EndpointEvents(UUID endpointId) {
        this.endpointId = endpointId;
    }
}