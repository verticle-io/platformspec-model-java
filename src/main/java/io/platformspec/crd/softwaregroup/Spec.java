package io.platformspec.crd.softwaregroup;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.softwaregroup.spec.Packages;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    List<Packages> packages;
}
