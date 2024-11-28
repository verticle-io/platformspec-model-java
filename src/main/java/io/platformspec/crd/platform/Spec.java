package io.platformspec.crd.platform;

import io.fabric8.generator.annotation.Required;
import io.platformspec.crd.platform.spec.Dns;
import io.platformspec.crd.platform.spec.Resources;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Jacksonized
public class Spec {
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
