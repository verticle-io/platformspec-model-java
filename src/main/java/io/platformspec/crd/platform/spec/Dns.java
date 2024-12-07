package io.platformspec.crd.platform.spec;

import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;
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
public class Dns {

    @Required
    ObjectReference providerRef;

    @Required
    String domain;
}
