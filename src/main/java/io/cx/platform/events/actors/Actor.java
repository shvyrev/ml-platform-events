package io.cx.platform.events.actors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Optional.ofNullable;
import static java.util.function.Predicate.not;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
public class Actor {
    public static final String DELIMITER = ":";
    private final ActorType type;
    private final String name;
    private String user;

    @JsonCreator
    public Actor(
            @JsonProperty("type") ActorType type,
            @JsonProperty("name") String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return Stream.of(getType(), getName(), getUser())
                .filter(Objects::nonNull)
                .map(v -> v.toString().trim().toLowerCase())
                .filter(not(String::isEmpty))
                .collect(Collectors.joining(DELIMITER));
    }

    public static boolean isValid(String value) {
        return ofNullable(value)
                .map(String::trim)
                .filter(not(String::isEmpty))
                .map(v -> v.split(DELIMITER))
                .map(v -> v.length > 1)
                .orElse(false);
    }

    public static Actor fromString(String value) {
        return ofNullable(value)
                .map(String::trim)
                .filter(not(String::isEmpty))
                .map(v -> v.split(DELIMITER))
                .map(v -> new Actor(ActorType.fromString(v[0]), v[1])
                        .setUser(v.length > 2 ? v[2] : null))
                .orElseThrow(() -> new IllegalArgumentException("Actor string cannot be null or empty."));
    }
}
