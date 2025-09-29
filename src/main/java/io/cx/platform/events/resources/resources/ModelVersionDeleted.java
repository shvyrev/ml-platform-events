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
public final class ModelVersionDeleted extends ResourceEvents {
    private UUID model;
    private UUID version;

    public ModelVersionDeleted(ServingResourceInfo info) {
        super(info);
    }

    @JsonCreator
    public ModelVersionDeleted(@JsonProperty("model") UUID model,
                               @JsonProperty("version") UUID version,
                               @JsonProperty("info") ServingResourceInfo info) {
        super(info);
        this.model = model;
        this.version = version;
    }
}
