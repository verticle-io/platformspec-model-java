package io.platformspec.crd.softwaregroup;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.softwaregroup.spec.Packages;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    List<Packages> packages;
}
