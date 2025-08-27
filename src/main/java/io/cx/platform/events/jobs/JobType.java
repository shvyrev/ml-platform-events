package io.cx.platform.events.jobs;

import lombok.Getter;
import lombok.experimental.Accessors;

import static java.util.Arrays.stream;

@Getter
@Accessors(fluent = true, chain = true)
public enum JobType {
    REGISTER_USER_MODEL_VERSION("register-user-model-version"),
    DELETE_MODEL_VERSION("delete-model-version"),
    COPY_FILE_JOB("minio-copy-files-job"),
    DELETE_FILE_JOB("minio-delete-files-job"),
    UNKNOWN_JOB("unknown-job")
    ;

    private final String value;

    JobType(String s) {
        this.value = s;
    }

    public static JobType fromValue(String value) {
        return stream(JobType.values()).sequential()
                .filter(jobType -> jobType.value.equalsIgnoreCase(value)) // <-- ИСПРАВЛЕНИЕ ЗДЕСЬ
                .findFirst()
                .orElse(UNKNOWN_JOB);
    }
}