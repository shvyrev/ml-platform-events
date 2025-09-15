package io.cx.platform.events.resources.files;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public final class FileDeleted extends FileEvents {

    public FileDeleted() {
        super(null);
    }

    @JsonCreator
    public FileDeleted(@JsonProperty("fileInfo") FileInfo fileInfo) {
        super(fileInfo);
    }
}
