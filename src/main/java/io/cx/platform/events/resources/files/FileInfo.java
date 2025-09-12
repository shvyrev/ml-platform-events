package io.cx.platform.events.resources.files;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@ToString
public class FileInfo {
    private String filePath;
    private String owner;
}
