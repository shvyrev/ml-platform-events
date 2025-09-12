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
public final class FileStored extends FileEvents {

    public FileStored() {
        super(null);
    }

    public FileStored(FileInfo fileInfo) {
        super(fileInfo);
    }
}
