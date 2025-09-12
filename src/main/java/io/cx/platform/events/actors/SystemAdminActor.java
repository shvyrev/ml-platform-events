package io.cx.platform.events.actors;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public class SystemAdminActor extends Actor {

    public SystemAdminActor(String name) {
        super(ActorType.SYSTEM_ADMIN, name);
    }
}
