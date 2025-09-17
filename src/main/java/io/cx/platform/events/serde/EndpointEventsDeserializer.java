package io.cx.platform.events.serde;

import io.cx.platform.events.resources.endpoint.EndpointEvents;
import io.cx.platform.events.resources.model.ModelEvents;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class EndpointEventsDeserializer extends ObjectMapperDeserializer<EndpointEvents> {
    public EndpointEventsDeserializer() {
        super(EndpointEvents.class);
    }
}
