package io.cx.platform.events.serde;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.cx.platform.events.resources.model.ModelEvents;
import org.apache.kafka.common.serialization.Serializer;

public class ModelEventsSerializer implements Serializer<ModelEvents> {
    private final ObjectMapper objectMapper = new ObjectMapper()
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    @Override
    public byte[] serialize(String topic, ModelEvents data) {
        try {
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new RuntimeException("Error serializing ResourceEvents", e);
        }
    }
}
