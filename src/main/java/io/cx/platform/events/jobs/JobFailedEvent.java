package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public final class JobFailedEvent extends JobEvents {
    public JobFailedEvent() {
        super(null);
    }
    public JobFailedEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
