package io.cx.platform.events;

public record FailedStatus(Integer exitCode, String reason, String message, String log) {}
