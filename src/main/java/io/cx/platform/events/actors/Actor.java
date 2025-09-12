package io.cx.platform.events.actors;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@AllArgsConstructor
public class Actor {
    private final ActorType type;
    private final String name;

    @Override
    public String toString() {
        return Stream.of(getType(), getName())
                .filter(Objects::nonNull)
                .map(v -> v.toString().trim().toLowerCase())
                .reduce("", (a, b) -> a + ":" + b);
    }
}
