package io.cx.platform.events.jobs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    public DeleteFileEvent() {
        super(null);
    }

    public DeleteFileEvent(JobInfo jobInfo) {
        super(jobInfo);
    }

    @JsonCreator
    public DeleteFileEvent(@JsonProperty("jobInfo") JobInfo jobInfo,
                           @JsonProperty("bucket") String bucket,
                           @JsonProperty("object") String object) {
        super(jobInfo);
        this.bucket = bucket;
        this.object = object;
    }
}
