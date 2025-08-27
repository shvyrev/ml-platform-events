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
public final class ServingResourceUpdated extends ServingResourceEvents {
    public ServingResourceUpdated() {
        super(null);
    }
    public ServingResourceUpdated(ServingResourceInfo info) {
        super(info);
    }
}
