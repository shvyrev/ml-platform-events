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

    public CreateInferenceServiceEvent(ServingResourceInfo resourceInfo, String modelName, String modelFormat, String runtimeName, String storageSecretKey, String artifactPath, String bucketName) {
        super(resourceInfo);
        this.modelName = modelName;
        this.modelFormat = modelFormat;
        this.runtimeName = runtimeName;
        this.storageSecretKey = storageSecretKey;
        this.artifactPath = artifactPath;
        this.bucketName = bucketName;
    }
}
