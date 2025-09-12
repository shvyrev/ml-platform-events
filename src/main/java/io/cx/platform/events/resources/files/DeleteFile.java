package io.cx.platform.events.resources.files;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class DeleteFile extends FileEvents {
    public DeleteFile() {
        super(null);
    }

    public DeleteFile(FileInfo fileInfo) {
        super(fileInfo);
    }
}
