package io.cx.platform.events.jobs;

import io.cx.platform.events.BaseEvent;
import lombok.Getter;

@Getter
public sealed class JobEvents extends BaseEvent permits CopyFileEvent, DeleteFileEvent, DeleteModelVersionEvent,
        DeleteVersionFailedEvent, DeleteVersionStatusEvent, DeleteVersionSucceedEvent, JobCreatedEvent,
        JobDeletedEvent, JobFailedEvent, JobSucceededEvent, RegisterUserModelVersionEvent,
        RegistrationModelVersionFailedEvent, RegistrationModelVersionStatusEvent, RegistrationModelVersionSucceedEvent {
    protected final JobInfo info;

    public JobEvents(JobInfo jobInfo) {
        this.info = jobInfo;
    }
}