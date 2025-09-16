package io.cx.platform.events.resources.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;
import lombok.experimental.Accessors;

import static io.cx.platform.events.resources.model.TritonInstanceKind.KIND_CPU;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@RegisterForReflection
public class TritonConfigParams {
    public int maxBatchSize = 8;
    public boolean dynamicBatching = true;
    public int maxQueueDelayMicroseconds = 1000;
    public int instanceCount = 1;
    public TritonInstanceKind instanceKind = KIND_CPU;
}
