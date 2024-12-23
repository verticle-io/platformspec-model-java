package io.platformspec.crd.image;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.platformspec.crd.image.spec.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
public class Spec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    Category category;
    io.platformspec.crd.image.spec.Spec spec;
}
