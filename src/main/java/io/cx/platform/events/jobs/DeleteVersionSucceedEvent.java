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
public final class DeleteVersionSucceedEvent extends JobEvents {
    private UUID modelId;
    private UUID versionId;

    public DeleteVersionSucceedEvent() {
        super(null);
    }

    public DeleteVersionSucceedEvent(JobInfo jobInfo) {
        super(jobInfo);
    }

    public DeleteVersionSucceedEvent(JobInfo jobInfo, UUID modelId, UUID versionId) {
        super(jobInfo);
        this.modelId = modelId;
        this.versionId = versionId;
    }
}
