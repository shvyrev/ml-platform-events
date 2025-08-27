package io.cx.platform.events.resources;

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
public final class DeleteInferenceServiceEvent extends ServingResourceEvents {
    public DeleteInferenceServiceEvent() {
        super(null);
    }

    @JsonCreator
    public DeleteInferenceServiceEvent(@JsonProperty("resourceInfo")ServingResourceInfo resourceInfo) {
        super(resourceInfo);
    }
}
