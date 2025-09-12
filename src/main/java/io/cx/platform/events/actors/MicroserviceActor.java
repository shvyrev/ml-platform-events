package io.cx.platform.events.actors;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public class MicroserviceActor extends Actor {
    public MicroserviceActor(String name) {
        super(ActorType.SERVICE, name);
    }
}
