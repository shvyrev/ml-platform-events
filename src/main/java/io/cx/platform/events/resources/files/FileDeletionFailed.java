package io.cx.platform.events.resources.files;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.actors.Actor;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class FileDeletionFailed extends FileEvents {
    private final Actor actor;
    private String cause;

    public FileDeletionFailed() {
        super(null);
        this.actor = null;
    }

    public FileDeletionFailed(FileCmdEvent event) {
        super(event.getFileInfo());
        this.actor = event.getActor();
    }

    @JsonCreator
    public FileDeletionFailed(
            @JsonProperty("fileInfo") FileInfo fileInfo,
            @JsonProperty("actor") Actor actor,
            @JsonProperty("cause") String cause) {
        super(fileInfo);
        this.actor = actor;
        this.cause = cause;
    }
}
