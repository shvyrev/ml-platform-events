package io.cx.platform.events.resources.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum ModelType {
    TENSORFLOW("tensorflow_savedmodel"),
    ONNX("onnxruntime_onnx"),
    PYTORCH("pytorch_libtorch"),
    KERAS("keras_h5"),
    TENSORRT("tensorrt_plan");
    private final String tritonPlatform;
}
