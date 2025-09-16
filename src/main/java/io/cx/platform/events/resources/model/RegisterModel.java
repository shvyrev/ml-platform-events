package io.cx.platform.events.resources.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cx.platform.events.CmdEvent;
import io.cx.platform.events.actors.Actor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class RegisterModel extends ModelEvents implements CmdEvent {
    private String displayName;
    private String modelDescription;
    private ModelType modelType = ModelType.ONNX;

    private TritonConfigParams configParams = new TritonConfigParams();

    private Map<String, String> labels;
    private List<InputOutputSchema> inputSchema;
    private List<InputOutputSchema> outputSchema;
    private Actor actor;

    public RegisterModel(UUID modelId) {
        super(modelId);
    }

    @JsonCreator
    public RegisterModel(
            @JsonProperty("actor") Actor actor,
            @JsonProperty("modelId") UUID modelId,
            @JsonProperty("displayName") String displayName,
            @JsonProperty("modelDescription") String modelDescription,
            @JsonProperty("modelType") ModelType modelType,
            @JsonProperty("configParams") TritonConfigParams configParams,
            @JsonProperty("labels") Map<String, String> labels,
            @JsonProperty("inputSchema") List<InputOutputSchema> inputSchema,
            @JsonProperty("outputSchema") List<InputOutputSchema> outputSchema) {
        super(modelId);
        this.actor = actor;
        this.displayName = displayName;
        this.modelDescription = modelDescription;
        this.modelType = modelType;
        this.configParams = configParams;
        this.labels = labels;
        this.inputSchema = inputSchema;
        this.outputSchema = outputSchema;
    }
}