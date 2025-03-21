package io.platformspec.crd.provider;

import io.platformspec.crd.BaseStatus;
import io.platformspec.crd.PlatformResourceStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Status extends BaseStatus implements PlatformResourceStatus {

}
