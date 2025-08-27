package io.cx.platform.events.jobs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;


@Getter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
public final class CopyFileEvent extends JobEvents {
    private String sourceBucket;
    private String sourceObject;
    private String destinationBucket;
    private String destinationObject;

    public CopyFileEvent() {
        super(null);
    }

    public CopyFileEvent(JobInfo jobInfo) {
        super(jobInfo);
    }

    @JsonCreator
    public CopyFileEvent(@JsonProperty("jobInfo") JobInfo jobInfo,
                         @JsonProperty("sourceBucket") String sourceBucket,
                         @JsonProperty("sourceObject") String sourceObject,
                         @JsonProperty("destinationBucket") String destinationBucket,
                         @JsonProperty("destinationObject") String destinationObject) {
        super(jobInfo);
        this.sourceBucket = sourceBucket;
        this.sourceObject = sourceObject;
        this.destinationBucket = destinationBucket;
        this.destinationObject = destinationObject;
    }
}
