package io.cx.platform.events.resources.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.resources.ServingResourceInfo;
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
public final class InferenceCreated extends ResourceEvents {
    private UUID model;
    private UUID version;
    private UUID endpoint;
    private String url;
    private Integer traffic;

    public InferenceCreated(ServingResourceInfo info) {
        super(info);
    }

    @JsonCreator
    public InferenceCreated(
            @JsonProperty("model") UUID model,
            @JsonProperty("version") UUID version,
            @JsonProperty("endpoint") UUID endpoint,
            @JsonProperty("url") String url,
            @JsonProperty("traffic") Integer traffic,
            @JsonProperty("info") ServingResourceInfo info) {
        super(info);
        this.model = model;
        this.version = version;
        this.endpoint = endpoint;
        this.url = url;
        this.traffic = traffic;
    }
}
