package io.cx.platform.events.resources.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.dto.InferenceParameters;
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
public final class ModelRegistered extends ModelEvents {
    private String userId;
    private InferenceParameters inferenceParameters;

    @JsonCreator
    public ModelRegistered(@JsonProperty("modelId") UUID modelId,
                           @JsonProperty("userId") String userId,
                           @JsonProperty("inferenceParameters") InferenceParameters inferenceParameters) {
        super(modelId);
        this.userId = userId;
        this.inferenceParameters = inferenceParameters;
    }

}
