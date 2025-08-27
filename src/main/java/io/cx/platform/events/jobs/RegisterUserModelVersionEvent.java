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
public final class RegisterUserModelVersionEvent extends JobEvents {
    private UUID modelId;
    private UUID versionId;
    private String userStoragePath;

    public RegisterUserModelVersionEvent() {
        super(null);
    }

    public RegisterUserModelVersionEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
