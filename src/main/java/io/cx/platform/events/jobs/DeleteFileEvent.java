package io.cx.platform.events.jobs;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import static java.util.Optional.ofNullable;

@Getter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class DeleteFileEvent extends JobEvents {
    private String bucket;
    private String object;

    public DeleteFileEvent(JobInfo jobInfo) {
        super(jobInfo);
    }
}
