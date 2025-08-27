package io.cx.platform.events.resources;

import io.cx.platform.events.dto.InfraResources;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContainerResources {
    private InfraResources requests, limits;
}
