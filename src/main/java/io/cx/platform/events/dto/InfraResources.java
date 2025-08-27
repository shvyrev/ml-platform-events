package io.cx.platform.events.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InfraResources {
    private String cpu = "1";
    private String memory = "1Gi";
    private String gpu = "1"; // Формат: "1" или "nvidia.com/gpu:1"
}
