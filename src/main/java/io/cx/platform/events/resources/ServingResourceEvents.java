package io.cx.platform.events.resources;

import io.cx.platform.events.BaseEvent;
import lombok.Getter;

@Getter
@Deprecated
public sealed class ServingResourceEvents extends BaseEvent permits CreateInferenceServiceEvent, CreateRuntimeEvent,
        DeleteInferenceServiceEvent, DeleteRuntimeEvent, ServingResourceCreated,
        ServingResourceDeleted, ServingResourceUpdated {
    protected final ServingResourceInfo info;

    public ServingResourceEvents(ServingResourceInfo resourceInfo) {
        this.info = resourceInfo;
    }
}