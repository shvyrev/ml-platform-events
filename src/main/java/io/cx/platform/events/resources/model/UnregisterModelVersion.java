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
public final class UnregisterModelVersion extends ModelEvents implements CmdEvent {
    private UUID versionId;
    private Actor actor;

    @JsonCreator
    public UnregisterModelVersion(@JsonProperty("modelId") UUID modelId,
                                  @JsonProperty("versionId") UUID versionId,
                                  @JsonProperty("actor") Actor actor) {
        super(modelId);
        this.versionId = versionId;
        this.actor = actor;
    }

    public UnregisterModelVersion(UUID modelId) {
        super(modelId);
    }
}
