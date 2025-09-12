package io.cx.platform.events.resources.files;

import io.cx.platform.events.CmdEvent;

public interface FileCmdEvent extends CmdEvent {
    FileInfo getFileInfo();
}
