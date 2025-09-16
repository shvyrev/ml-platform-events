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
public final class UnregisterModel extends ModelEvents implements CmdEvent {
    private Actor actor;

    @JsonCreator
    public UnregisterModel(@JsonProperty("modelId") UUID modelId, @JsonProperty("actor") Actor actor) {
        super(modelId);
        this.actor = actor;
    }

    public UnregisterModel() {
        super(null);
    }
}
