package io.cx.platform.events.resources.endpoint;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class EndpointUpdated extends EndpointEvent {
    private String userId;
    private Set<UUID> roles;
    private Map<String, String> labels;

    @JsonCreator
    public EndpointUpdated(
            @JsonProperty("endpointId") UUID endpointId,
            @JsonProperty("userId") String userId,
            @JsonProperty("roles") Set<UUID> roles,
            @JsonProperty("labels") Map<String, String> labels) {
        super(endpointId);
        this.userId = userId;
        this.roles = roles;
        this.labels = labels;
    }

    public EndpointUpdated(UUID endpointId) {
        super(endpointId);
    }
}
