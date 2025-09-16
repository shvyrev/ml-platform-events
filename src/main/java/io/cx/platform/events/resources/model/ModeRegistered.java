package io.cx.platform.events.resources.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public final class ModeRegistered extends ModelEvents {

    @JsonCreator
    public ModeRegistered(@JsonProperty UUID modelId) {
        super(modelId);
    }
}
