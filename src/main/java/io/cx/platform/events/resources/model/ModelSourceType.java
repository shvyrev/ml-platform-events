package io.cx.platform.events.resources.model;

public enum ModelSourceType {
    TRAINED,        // Модель была обучена
    IMPORTED,       // Модель была импортирована из ModelGarden
    TRANSFERRED,    // Модель была перенесена из s3
    UNSPECIFIED     // Не указан
}
