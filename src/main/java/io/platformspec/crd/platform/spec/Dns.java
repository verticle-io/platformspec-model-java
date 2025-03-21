package io.platformspec.crd.platform.spec;

import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Dns {

    @Required
    public ObjectReference providerRef;

    @Required
    String domain;
}
