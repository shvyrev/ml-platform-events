package io.cx.platform.events.resources.files;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class FileStoringFailed extends FileEvents {
    public FileStoringFailed() {
        super(null);
    }

    public FileStoringFailed(FileInfo fileInfo) {
        super(fileInfo);
    }
}
