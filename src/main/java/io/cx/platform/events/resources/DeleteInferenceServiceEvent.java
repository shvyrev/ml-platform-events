package io.cx.platform.events.resources;

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
    public DeleteInferenceServiceEvent(ServingResourceInfo resourceInfo) {
        super(resourceInfo);
    }

    public DeleteInferenceServiceEvent() {
        super(null);
    }
}
