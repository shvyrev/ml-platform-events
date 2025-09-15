package io.cx.platform.events.resources.files;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cx.platform.events.BaseEvent;
import lombok.Getter;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "eventType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = StoreFile.class, name = "StoreFile"),
        @JsonSubTypes.Type(value = DeleteFile.class, name = "DeleteFile"),
        @JsonSubTypes.Type(value = FileDeleted.class, name = "FileDeleted"),
        @JsonSubTypes.Type(value = FileDeletionFailed.class, name = "FileDeletionFailed"),
        @JsonSubTypes.Type(value = FileStored.class, name = "FileStored"),
        @JsonSubTypes.Type(value = FileStoringFailed.class, name = "FileStoringFailed")
})
@Getter
public sealed class FileEvents extends BaseEvent permits StoreFile, DeleteFile,
        FileDeleted, FileDeletionFailed, FileStored, FileStoringFailed {
    private final FileInfo fileInfo;

    public FileEvents(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}