package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public final class JobSucceededEvent extends JobEvents {
    public JobSucceededEvent() {
        super(null);
    }
    public JobSucceededEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
