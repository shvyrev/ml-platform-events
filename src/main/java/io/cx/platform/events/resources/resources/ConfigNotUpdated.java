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
public final class ConfigNotUpdated extends ResourceEvents {
    private UUID model;

    @JsonCreator
    public ConfigNotUpdated(@JsonProperty("info") ServingResourceInfo info,
                            @JsonProperty("model") UUID model) {
        super(info);
        this.model = model;
    }
}
