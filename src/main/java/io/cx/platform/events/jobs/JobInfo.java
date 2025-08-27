package io.cx.platform.events.jobs;

import io.cx.platform.events.FailedStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Map;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@ToString
public class JobInfo {
    private String name;
    private JobType type;
    private JobStatus status;
    private String owner;
    private FailedStatus cause;
    private Map<String, String> labels;
}
