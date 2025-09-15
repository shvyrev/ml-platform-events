package io.cx.platform.events.resources.files;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.actors.Actor;
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
public final class FileStoringFailed extends FileEvents {
    private final Actor actor;
    private String cause;

    public FileStoringFailed() {
        super(null);
        this.actor = null;
    }

    public FileStoringFailed(FileCmdEvent event) {
        super(event.getFileInfo());
        this.actor = event.getActor();
    }

    @JsonCreator
    public FileStoringFailed(
            @JsonProperty("fileInfo") FileInfo fileInfo,
            @JsonProperty("actor") Actor actor,
            @JsonProperty("cause") String cause) {
        super(fileInfo);
        this.actor = actor;
        this.cause = cause;
    }
}
