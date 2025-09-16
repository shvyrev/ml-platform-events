package io.cx.platform.events.resources.endpoint;

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
public final class EndpointCreated extends EndpointEvents {
    private String userId;

    @JsonCreator
    public EndpointCreated(
            @JsonProperty("endpointId") UUID endpointId,
            @JsonProperty("userId") String userId) {
        super(endpointId);
        this.userId = userId;
    }

    public EndpointCreated() {
        super(null);
    }
}