package io.cx.platform.events.resources.files;

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
    private final String cause;

    public FileStoringFailed() {
        super(null);
        this.actor = null;
        this.cause = null;
    }


    public FileStoringFailed(String cause) {
        super(null);
        this.cause = cause;
        this.actor = null;
    }

    public FileStoringFailed(FileCmdEvent event, String cause) {
        super(event.getFileInfo());
        this.actor = event.getActor();
        this.cause = cause;
    }

    public FileStoringFailed(FileInfo fileInfo, Actor actor, String cause) {
        super(fileInfo);
        this.actor = actor;
        this.cause = cause;
    }
}
