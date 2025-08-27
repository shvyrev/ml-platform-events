package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;


@Getter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class CopyFileEvent extends JobEvents {
    private String sourceBucket;
    private String sourceObject;
    private String destinationBucket;
    private String destinationObject;

    public CopyFileEvent() {
        super(null);
    }

    public CopyFileEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
