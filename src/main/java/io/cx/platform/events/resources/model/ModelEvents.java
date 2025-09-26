package io.cx.platform.events.resources.model;

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
        @JsonSubTypes.Type(value = RegisterModel.class, name = "registerModel"),
        @JsonSubTypes.Type(value = UnregisterModel.class, name = "unregisterModel"),
        @JsonSubTypes.Type(value = RegisterModelVersion.class, name = "registerModelVersion"),
        @JsonSubTypes.Type(value = UnregisterModelVersion.class, name = "unregisterModelVersion"),
        @JsonSubTypes.Type(value = ModelRegistered.class, name = "modeRegistered"),
        @JsonSubTypes.Type(value = ModelUnregistered.class, name = "modelUnregistered"),
        @JsonSubTypes.Type(value = ModelVersionRegistered.class, name = "modelVersionRegistered"),
        @JsonSubTypes.Type(value = ModelVersionUnregistered.class, name = "modelVersionUnregistered")
})
@Getter
public sealed class ModelEvents extends BaseEvent permits RegisterModel, UnregisterModel,
        RegisterModelVersion, UnregisterModelVersion,
        ModelRegistered, ModelConfigUpdated, ModelUnregistered, ModelVersionRegistered, ModelVersionUnregistered {
    private final UUID modelId;

    public ModelEvents(UUID modelId) {
        this.modelId = modelId;
    }
}