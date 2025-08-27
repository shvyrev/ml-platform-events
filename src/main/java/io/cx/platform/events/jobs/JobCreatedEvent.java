package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public final class JobCreatedEvent extends JobEvents {
    public JobCreatedEvent() {
        super(null);
    }

    public JobCreatedEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}