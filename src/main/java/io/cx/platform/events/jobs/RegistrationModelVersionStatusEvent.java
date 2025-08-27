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
public final class RegistrationModelVersionStatusEvent extends JobEvents {
    private UUID modelId;
    private UUID versionId;

    public RegistrationModelVersionStatusEvent() {
        super(null);
    }

    public RegistrationModelVersionStatusEvent(JobInfo jobInfo) {
        super(jobInfo);
    }

    public RegistrationModelVersionStatusEvent(JobInfo jobInfo, UUID modelId, UUID versionId) {
        super(jobInfo);

        this.modelId = modelId;
        this.versionId = versionId;
    }
}
