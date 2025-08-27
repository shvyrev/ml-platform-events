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
public final class RegistrationModelVersionFailedEvent extends JobEvents{
    private UUID modelId;
    private UUID versionId;

    public RegistrationModelVersionFailedEvent() {
        super(null);
    }

    public RegistrationModelVersionFailedEvent(JobInfo jobInfo) {
        super(jobInfo);
    }

    public RegistrationModelVersionFailedEvent(JobInfo jobInfo, UUID modelId, UUID versionId) {
        super(jobInfo);

        this.modelId = modelId;
        this.versionId = versionId;
    }
}
