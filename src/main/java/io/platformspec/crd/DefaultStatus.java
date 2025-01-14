package io.platformspec.crd;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
public class DefaultStatus extends BaseStatus implements PlatformResourceStatus {
}
