package io.cx.platform.events.dto;

public enum TritonPlatform {
    onnxruntime_onnx,      // Для моделей ONNX
    tensorflow_savedmodel, // Для моделей TensorFlow SavedModel
    tensorflow_graphdef,   // Для моделей TensorFlow GraphDef
    tensorrt_plan,         // Для оптимизированных моделей NVIDIA TensorRT
    pytorch_libtorch,      // Для моделей PyTorch LibTorch
    python,                // Для пользовательских бэкендов на Python
}