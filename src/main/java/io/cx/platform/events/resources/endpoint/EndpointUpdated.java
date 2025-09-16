package io.cx.platform.events.resources.endpoint;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class EndpointUpdated extends EndpointEvents {
    private String userId;
    private Map<UUID, Integer> models = new HashMap<>();

    @JsonCreator
    public EndpointUpdated(
            @JsonProperty("endpointId") UUID endpointId,
            @JsonProperty("userId") String userId,
            @JsonProperty("models") Map<UUID, Integer> models) {
        super(endpointId);
        this.userId = userId;
        this.models = models;
    }

    public EndpointUpdated(UUID endpointId) {
        super(endpointId);
    }
}
