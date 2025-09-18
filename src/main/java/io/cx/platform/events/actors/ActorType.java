package io.cx.platform.events.actors;

import static java.util.Optional.ofNullable;
import static java.util.function.Predicate.not;

public enum ActorType {
    USER,
    SYSTEM_ADMIN,
    SERVICE;


    public static final String ACTOR_TYPE_STRING_CANNOT_BE_NULL = "ActorType string cannot be null.";

    public static ActorType fromString(String value) {
        return ofNullable(value)
                .map(String::trim)
                .filter(not(String::isEmpty))
                .map(String::toUpperCase)
                .map(ActorType::valueOf)
                .orElseThrow(() -> new IllegalArgumentException(ACTOR_TYPE_STRING_CANNOT_BE_NULL));
    }
}
