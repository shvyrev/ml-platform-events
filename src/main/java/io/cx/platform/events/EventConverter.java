package io.cx.platform.events;

import java.util.function.Function;

public interface EventConverter {

    record Converter<V, T>(
            Class<V> objClass,
            Class<T> eventClass,
            Function<Object, BaseEvent> converter
    ) {}

    <V, T extends BaseEvent> Function<Object, BaseEvent> convert(V value, Class<T> clazz);
}
