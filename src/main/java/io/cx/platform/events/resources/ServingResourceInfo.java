package io.cx.platform.events.resources;

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
public class ServingResourceInfo {
    private String name;
    private ServingResourceType type;
    private ServingResourceStatus status;
    private String owner;
    private Boolean ready;
    private Map<String, String> labels;
    private FailedStatus cause;
}