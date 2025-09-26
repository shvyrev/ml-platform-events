package io.cx.platform.events.resources.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.dto.TritonConfig;
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
public final class ModelConfigUpdated extends ModelEvents {
    private String userId;
    private TritonConfig config;

    @JsonCreator
    public ModelConfigUpdated(
            @JsonProperty("modelId") UUID modelId,
            @JsonProperty("userId") String userId,
            @JsonProperty("config") TritonConfig config) {
        super(modelId);
        this.userId = userId;
        this.config = config;
    }
}
