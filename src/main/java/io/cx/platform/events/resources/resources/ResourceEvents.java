package io.cx.platform.events.resources.resources;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cx.platform.events.BaseEvent;
import io.cx.platform.events.resources.ServingResourceInfo;
import lombok.Getter;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "eventType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = RuntimeCreated.class, name = "runtimeCreated"),
        @JsonSubTypes.Type(value = RuntimeUpdated.class, name = "runtimeUpdated"),
        @JsonSubTypes.Type(value = RuntimeDeleted.class, name = "runtimeDeleted"),
        @JsonSubTypes.Type(value = InferenceCreated.class, name = "inferenceCreated"),
        @JsonSubTypes.Type(value = InferenceUpdated.class, name = "inferenceUpdated"),
        @JsonSubTypes.Type(value = InferenceDeleted.class, name = "inferenceDeleted")
})
@Getter
public sealed class ResourceEvents extends BaseEvent permits
        ConfigUpdated, ConfigNotUpdated,
        ModelVersionStored, ModelVersionNotStored,
        ModelVersionDeleted, ModelVersionNotDeleted,
        ModelDeleted, ModelNotDeleted,
        RuntimeCreated, RuntimeUpdated, RuntimeDeleted,
        InferenceCreated, InferenceUpdated, InferenceDeleted {

    private final ServingResourceInfo info;

    public ResourceEvents(ServingResourceInfo info) {
        this.info = info;
    }
}
