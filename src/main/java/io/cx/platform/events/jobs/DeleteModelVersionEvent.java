package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class DeleteModelVersionEvent extends JobEvents{
    private UUID modelId;
    private UUID versionId;

    public DeleteModelVersionEvent() {
        super(null);
    }

    public DeleteModelVersionEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
