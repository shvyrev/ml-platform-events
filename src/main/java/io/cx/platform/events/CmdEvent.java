package io.cx.platform.events;

import io.cx.platform.events.actors.Actor;

public interface CmdEvent {
    Actor getActor();
}
