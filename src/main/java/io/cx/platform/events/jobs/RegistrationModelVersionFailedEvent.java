package io.cx.platform.events.jobs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonCreator
    public RegistrationModelVersionFailedEvent(@JsonProperty("jobInfo") JobInfo jobInfo,@JsonProperty("modelId") UUID modelId,@JsonProperty("versionId") UUID versionId) {
        super(jobInfo);

        this.modelId = modelId;
        this.versionId = versionId;
    }
}
