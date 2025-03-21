package io.platformspec.crd.platform;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.generator.annotation.Required;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.platform.spec.Dns;
import io.platformspec.crd.platform.spec.Resources;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Jacksonized
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    @Required
    String title;

    @Required
    String organization;

    String description;

    String author;

    @Required
    String version;

    @Required
    String contactEmail;

    Dns dns;

    @Required
    Resources resources;
}
