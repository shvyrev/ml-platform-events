package io.cx.platform.events.serde;

import io.cx.platform.events.resources.model.ModelEvents;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ModelEventsDeserializer extends ObjectMapperDeserializer<ModelEvents> {
    public ModelEventsDeserializer() {
        super(ModelEvents.class);
    }
}
