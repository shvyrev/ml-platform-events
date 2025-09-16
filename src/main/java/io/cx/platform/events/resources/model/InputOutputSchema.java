package io.cx.platform.events.resources.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@RegisterForReflection
@EqualsAndHashCode
@ToString
public class InputOutputSchema {

    @JsonProperty("name")
    @NotBlank
    private String name;

    @JsonProperty("dtype")
    private String dataType;

    @JsonProperty("shape")
    @NotNull
    private List<Integer> shape;
}