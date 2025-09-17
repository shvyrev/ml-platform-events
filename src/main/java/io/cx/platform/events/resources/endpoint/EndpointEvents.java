package io.cx.platform.events.resources.endpoint;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cx.platform.events.BaseEvent;
import lombok.Getter;

import java.util.UUID;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "eventType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = EndpointCreated.class, name = "EndpointCreated"),
        @JsonSubTypes.Type(value = EndpointUpdated.class, name = "EndpointUpdated"),
        @JsonSubTypes.Type(value = EndpointDeleted.class, name = "EndpointDeleted")
})
@Getter
public sealed class EndpointEvents extends BaseEvent permits DeployModel, UndeployModel, UpdateDeployedModel,
        EndpointCreated, EndpointUpdated, EndpointDeleted {
    private final UUID endpointId;

    public EndpointEvents(UUID endpointId) {
        this.endpointId = endpointId;
    }
}