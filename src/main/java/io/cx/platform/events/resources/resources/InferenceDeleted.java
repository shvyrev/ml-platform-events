package io.cx.platform.events.resources.resources;

import io.cx.platform.events.resources.ServingResourceInfo;

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
public final class InferenceDeleted extends ResourceEvents {
    private UUID modelId;
    private UUID versionId;
    private String runtimeName;

    public InferenceDeleted(ServingResourceInfo info) {
        super(info);
    }

    @JsonCreator
    public InferenceDeleted(
            @JsonProperty("modelId") UUID modelId,
            @JsonProperty("versionId") UUID versionId,
            @JsonProperty("runtimeName") String runtimeName,
            @JsonProperty("info") ServingResourceInfo info) {
        super(info);
        this.modelId = modelId;
        this.versionId = versionId;
        this.runtimeName = runtimeName;
    }
}
