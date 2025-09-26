package io.cx.platform.events.resources.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class ModelVersionUnregistered extends ModelEvents {
    private UUID versionId;
    private String userId;

    @JsonCreator
    public ModelVersionUnregistered(@JsonProperty("modelId") UUID modelId,
                                    @JsonProperty("userId") String userId,
                                    @JsonProperty("versionId") UUID versionId) {
        super(modelId);
        this.userId = userId;
        this.versionId = versionId;
    }
}