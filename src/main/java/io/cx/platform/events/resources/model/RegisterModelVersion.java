package io.cx.platform.events.resources.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.CmdEvent;
import io.cx.platform.events.actors.Actor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.UUID;
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class RegisterModelVersion extends ModelEvents implements CmdEvent {
    private String version;
    private String artifactPath;
    private Actor actor;

    public RegisterModelVersion() {
        super(null);
    }

    @JsonCreator
    public RegisterModelVersion(
            @JsonProperty("actor") Actor actor,
            @JsonProperty("modelId") UUID modelId,
            @JsonProperty("version") String version,
            @JsonProperty("artifactPath") String artifactPath) {
        super(modelId);
        this.actor = actor;
        this.version = version;
        this.artifactPath = artifactPath;
    }

    public RegisterModelVersion(UUID modelId) {
        super(modelId);
    }
}
