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
public final class DeleteFile extends FileEvents implements FileCmdEvent {
    private final Actor actor;

    public DeleteFile() {
        super(null);
        this.actor = null;
    }

    public DeleteFile(Actor actor) {
        super(null);
        this.actor = actor;
    }

    @JsonCreator
    public DeleteFile(@JsonProperty("fileInfo") FileInfo fileInfo, @JsonProperty("actor") Actor actor) {
        super(fileInfo);
        this.actor = actor;
    }
}
