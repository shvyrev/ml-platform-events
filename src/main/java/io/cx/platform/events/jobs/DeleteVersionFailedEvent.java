package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.UUID;

@Getter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class DeleteVersionFailedEvent extends JobEvents {
    private UUID modelId;
    private UUID versionId;

    public DeleteVersionFailedEvent() {
        super(null);
    }

    public DeleteVersionFailedEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
