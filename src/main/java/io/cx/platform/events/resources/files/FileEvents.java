package io.cx.platform.events.resources.files;

import io.cx.platform.events.BaseEvent;
import lombok.Getter;

@Getter
public sealed class FileEvents extends BaseEvent permits StoreFile, DeleteFile,
        FileDeleted, FileDeletionFailed, FileStored, FileStoringFailed {
    protected final FileInfo fileInfo;

    public FileEvents(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
}
