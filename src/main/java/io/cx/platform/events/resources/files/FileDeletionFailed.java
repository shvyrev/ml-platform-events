package io.cx.platform.events.resources.files;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class FileDeletionFailed extends FileEvents {

    public FileDeletionFailed() {
        super(null);
    }

    public FileDeletionFailed(FileInfo fileInfo) {
        super(fileInfo);
    }
}
