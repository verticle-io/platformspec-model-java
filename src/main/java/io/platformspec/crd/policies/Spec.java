package io.platformspec.crd.policies;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.platformspec.crd.PlatformResourceSpec;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@Builder
@Jacksonized
@Data
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    //TODO spec
}
