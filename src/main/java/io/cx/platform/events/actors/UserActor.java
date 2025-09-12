package io.cx.platform.events.actors;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public class UserActor extends Actor {
    public UserActor(String userId) {
        super(ActorType.USER, userId);
    }
}
