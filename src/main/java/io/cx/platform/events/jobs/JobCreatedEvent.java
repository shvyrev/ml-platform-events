package io.cx.platform.events.jobs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public final class JobCreatedEvent extends JobEvents {
    public JobCreatedEvent() {
        super(null);
    }

    @JsonCreator
    public JobCreatedEvent(@JsonProperty("jobInfo") JobInfo jobInfo) {
        super(jobInfo);
    }
}