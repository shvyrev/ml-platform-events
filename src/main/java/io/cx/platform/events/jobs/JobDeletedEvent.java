package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public final class JobDeletedEvent extends JobEvents {
    public JobDeletedEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
