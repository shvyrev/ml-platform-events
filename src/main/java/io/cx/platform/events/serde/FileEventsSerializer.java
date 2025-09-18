package io.cx.platform.events.serde;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.cx.platform.events.resources.files.FileEvents;
import org.apache.kafka.common.serialization.Serializer;

public class FileEventsSerializer implements Serializer<FileEvents> {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    @Override
    public byte[] serialize(String topic, FileEvents data) {
        try {
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new RuntimeException("Error serializing FileEvents", e);
        }
    }
}
