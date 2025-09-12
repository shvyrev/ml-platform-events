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

    public FileStoringFailed() {
        super(null);
        this.actor = null;
    }

    public FileStoringFailed(FileCmdEvent event) {
        super(event.getFileInfo());
        this.actor = event.getActor();
    }

    public FileStoringFailed(FileInfo fileInfo, Actor actor) {
        super(fileInfo);
        this.actor = actor;
    }
}
