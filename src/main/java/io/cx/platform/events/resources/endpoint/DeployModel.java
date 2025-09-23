package io.cx.platform.events.resources.endpoint;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.CmdEvent;
import io.cx.platform.events.actors.Actor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.kafka.common.protocol.types.Field;

import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class DeployModel extends EndpointEvents implements CmdEvent {
    private Actor actor;
    private UUID modelId;
    private UUID versionId;
    private Integer traffic;
    private String modelFormat;
    private String artifactPath;

    public DeployModel(UUID endpointId) {
        super(endpointId);
    }

    @JsonCreator
    public DeployModel(
            @JsonProperty("endpointId") UUID endpointId,
            @JsonProperty("actor") Actor actor,
            @JsonProperty("modelId") UUID modelId,
            @JsonProperty("versionId") UUID versionId,
            @JsonProperty("traffic") Integer traffic,
            @JsonProperty("modelFormat") String modelFormat) {
        super(endpointId);
        this.actor = actor;
        this.modelId = modelId;
        this.versionId = versionId;
        this.traffic = traffic;
    }
}
