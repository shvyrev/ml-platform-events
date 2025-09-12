package io.cx.platform.events.actors;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Actor {
    private final ActorType type;
    private final String name;
}
