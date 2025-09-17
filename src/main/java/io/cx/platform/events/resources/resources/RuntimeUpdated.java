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
public final class RuntimeUpdated extends ResourceEvents {
    private UUID endpoint;

    public RuntimeUpdated(ServingResourceInfo info) {
        super(info);
    }

    @JsonCreator
    public RuntimeUpdated(@JsonProperty("endpoint") UUID endpoint, @JsonProperty("info") ServingResourceInfo info) {
        super(info);
        this.endpoint = endpoint;
    }
}
