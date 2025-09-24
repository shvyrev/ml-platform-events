package io.cx.platform.events.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Deprecated
public final class ServingResourceDeleted extends ServingResourceEvents {
    public ServingResourceDeleted() {
        super(null);
    }

    @JsonCreator
    public ServingResourceDeleted(@JsonProperty("resourceInfo")ServingResourceInfo info) {
        super(info);
    }
}
