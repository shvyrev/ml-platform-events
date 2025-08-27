package io.cx.platform.events.resources;

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
public final class CreateRuntimeEvent extends ServingResourceEvents {
    private String schSizeLimit;
    private ContainerResources resources;

    public CreateRuntimeEvent() {
        super(null);
    }

    public CreateRuntimeEvent(ServingResourceInfo resourceInfo) {
        super(resourceInfo);
    }

    public CreateRuntimeEvent(ServingResourceInfo resourceInfo, String schSizeLimit, ContainerResources resources) {
        super(resourceInfo);
        this.schSizeLimit = schSizeLimit;
        this.resources = resources;
    }
}
