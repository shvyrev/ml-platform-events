package io.cx.platform.events.resources;

import lombok.Getter;
import lombok.experimental.Accessors;

import static java.util.Arrays.stream;

@Getter
@Accessors(fluent = true, chain = true)
public enum ServingResourceType {
    RUNTIME("cluster-serving-runtime"),
    INFERENCE("inference-service"),
    JOB("job"),
    UNKNOWN_TYPE("unknown");

    private String value;

    ServingResourceType() {
    }

    ServingResourceType(String s) {
        this.value = s;
    }

    public static ServingResourceType fromValue(String value) {
        return stream(ServingResourceType.values()).sequential()
                .filter(jobType -> jobType.value.equalsIgnoreCase(value))
                .findFirst()
                .orElse(UNKNOWN_TYPE);
    }
}
