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
    private UUID model;
    private UUID version;
    private UUID endpoint;

    public InferenceDeleted(ServingResourceInfo info) {
        super(info);
    }

    @JsonCreator
    public InferenceDeleted(
            @JsonProperty("model") UUID model,
            @JsonProperty("version") UUID version,
            @JsonProperty("endpoint") UUID endpoint,
            @JsonProperty("info") ServingResourceInfo info) {
        super(info);
        this.model = model;
        this.version = version;
        this.endpoint = endpoint;
    }
}
