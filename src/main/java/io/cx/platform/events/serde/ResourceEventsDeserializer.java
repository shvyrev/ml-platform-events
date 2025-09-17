package io.cx.platform.events.serde;

import io.cx.platform.events.resources.resources.ResourceEvents;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ResourceEventsDeserializer extends ObjectMapperDeserializer<ResourceEvents> {

    public ResourceEventsDeserializer() {
        super(ResourceEvents.class);
    }
}
