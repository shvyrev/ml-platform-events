package io.cx.platform.events.serde;

import io.cx.platform.events.resources.files.FileEvents;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class FileEventsDeserializer extends ObjectMapperDeserializer<FileEvents> {

    public FileEventsDeserializer() {
        super(FileEvents.class);
    }
}
