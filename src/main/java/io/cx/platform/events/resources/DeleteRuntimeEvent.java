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
public final class DeleteRuntimeEvent extends ServingResourceEvents{
    public DeleteRuntimeEvent() {
        super(null);
    }

    @JsonCreator
    public DeleteRuntimeEvent(@JsonProperty("resourceInfo")ServingResourceInfo resourceInfo) {
        super(resourceInfo);
    }
}
