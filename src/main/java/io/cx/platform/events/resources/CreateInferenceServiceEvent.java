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
    private final String modelName;
    private final String modelFormat;
    private final String runtimeName;
    private final String storageSecretKey;
    private final String artifactPath;
    private final String bucketName;

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
