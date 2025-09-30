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
public final class ModelVersionRegistered extends ModelEvents {
    private String userId;
    private UUID versionId;
    private String userStoragePath;
    private ModelType type = ModelType.ONNX;

    public ModelVersionRegistered() {
        super(null);
    }

    @JsonCreator
    public ModelVersionRegistered(
            @JsonProperty("modelId") UUID modelId,
            @JsonProperty("versionId") UUID versionId,
            @JsonProperty("userStoragePath") String userStoragePath,
            @JsonProperty("userId") String userId,
            @JsonProperty("type") ModelType type
    ) {
        super(modelId);
        this.versionId = versionId;
        this.userStoragePath = userStoragePath;
        this.userId = userId;
    }

    public ModelVersionRegistered(UUID modelId) {
        super(modelId);
    }
}