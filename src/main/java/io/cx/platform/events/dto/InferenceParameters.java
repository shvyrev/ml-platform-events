package io.cx.platform.events.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record InferenceParameters(
        // Спецификация для config.pbtxt
        @NotNull TritonPlatform platform,    // Платформа (например, ONNX)
        @NotNull Integer maxBatchSize,       // Максимальный размер батча (0 для отключения)
        @NotNull List<TensorParameters> inputs,     // Список входных тензоров
        @NotNull List<TensorParameters> outputs     // Список выходных тензоров
) {}