package io.cx.platform.events.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import static java.util.Optional.ofNullable;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
@Deprecated
public final class CreateRuntimeEvent extends ServingResourceEvents {
    private String schSizeLimit;
    private ContainerResources resources;

    public CreateRuntimeEvent() {
        super(null);
    }

    public CreateRuntimeEvent(ServingResourceInfo resourceInfo) {
        super(resourceInfo);
    }

    @JsonCreator
    public CreateRuntimeEvent(@JsonProperty("resourceInfo") ServingResourceInfo resourceInfo,
                              @JsonProperty("schSizeLimit") String schSizeLimit,
                              @JsonProperty("resources") ContainerResources resources) {
        super(resourceInfo);
        this.schSizeLimit = schSizeLimit;
        this.resources = resources;
    }
}
