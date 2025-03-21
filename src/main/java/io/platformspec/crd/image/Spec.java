package io.platformspec.crd.image;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.image.spec.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    Category category;
    io.platformspec.crd.image.spec.Spec spec;
}
