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
@Deprecated
public final class CreateInferenceServiceEvent extends ServingResourceEvents {
    private String modelName;
    private String modelFormat;
    private String runtimeName;
    private String storageSecretKey;
    private String artifactPath;
    private String bucketName;

    public CreateInferenceServiceEvent() {
        super(null);
    }

    public CreateInferenceServiceEvent(ServingResourceInfo resourceInfo) {
        super(resourceInfo);
    }

    @JsonCreator
    public CreateInferenceServiceEvent(@JsonProperty("resourceInfo") ServingResourceInfo resourceInfo,
                                       @JsonProperty("modelName") String modelName,@JsonProperty("modelFormat") String modelFormat,
                                       @JsonProperty("runtimeName") String runtimeName,@JsonProperty("storageSecretKey") String storageSecretKey,
                                       @JsonProperty("artifactPath") String artifactPath,@JsonProperty("bucketName") String bucketName) {
        super(resourceInfo);
        this.modelName = modelName;
        this.modelFormat = modelFormat;
        this.runtimeName = runtimeName;
        this.storageSecretKey = storageSecretKey;
        this.artifactPath = artifactPath;
        this.bucketName = bucketName;
    }
}
