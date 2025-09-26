package io.cx.platform.events.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TritonDataType {
    // Числа
    TYPE_INVALID("INVALID"),
    TYPE_BOOL("BOOL"),

    // Целые числа без знака (Unsigned Integers)
    TYPE_UINT8("UINT8"),
    TYPE_UINT16("UINT16"),
    TYPE_UINT32("UINT32"),
    TYPE_UINT64("UINT64"),

    // Целые числа со знаком (Signed Integers)
    TYPE_INT8("INT8"),
    TYPE_INT16("INT16"),
    TYPE_INT32("INT32"),
    TYPE_INT64("INT64"),

    // Числа с плавающей точкой (Floating Point)
    TYPE_FP16("FP16"),   // 16-битное число с плавающей точкой
    TYPE_FP32("FP32"),   // 32-битное число с плавающей точкой (наиболее часто используется)
    TYPE_FP64("FP64"),   // 64-битное число с плавающей точкой

    // Специальные типы
    TYPE_STRING("STRING"),
    TYPE_BF16("BF16");   // bfloat16

    private final String tritonName;
}
