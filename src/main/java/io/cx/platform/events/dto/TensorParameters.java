package io.cx.platform.events.dto;

import java.util.List;

// DTO for describing a single input or output tensor
public record TensorParameters(
        String name,                // Имя тензора (например, "input_1")
        TritonDataType dataType,    // Тип данных (например, TYPE_FP32)
        List<Long> dims             // Размерности (например, [-1, 224, 224, 3])
) {}