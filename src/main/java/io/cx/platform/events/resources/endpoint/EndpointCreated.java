package io.cx.platform.events.resources.endpoint;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.dto.InfraResources;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.UUID;

import static io.cx.platform.events.Const.GI_2;
import static java.util.Optional.ofNullable;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class EndpointCreated extends EndpointEvents {

    private String userId;
    private String schSizeLimit = GI_2;
    private InfraResources requestedResources = new InfraResources();
    private InfraResources limitedResources = new InfraResources();

    @JsonCreator
    public EndpointCreated(
            @JsonProperty("endpointId") UUID endpointId,
            @JsonProperty("userId") String userId,
            @JsonProperty("schSizeLimit") String schSizeLimit,
            @JsonProperty("request") InfraResources requestedResources,
            @JsonProperty("limit") InfraResources limitedResources) {
        super(endpointId);
        this.userId = userId;
        this.schSizeLimit = ofNullable(schSizeLimit)
                .orElse(GI_2);
        this.requestedResources = ofNullable(requestedResources)
                .orElse(new InfraResources());
        this.limitedResources = ofNullable(limitedResources)
                .orElse(new InfraResources());
    }

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