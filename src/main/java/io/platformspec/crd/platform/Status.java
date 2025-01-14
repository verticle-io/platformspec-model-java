package io.platformspec.crd.platform;

import io.platformspec.crd.BaseStatus;
import io.platformspec.crd.PlatformResourceStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
public class Status extends BaseStatus implements PlatformResourceStatus {
}
