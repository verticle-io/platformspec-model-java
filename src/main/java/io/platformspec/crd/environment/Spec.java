package io.platformspec.crd.environment;

import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;

import java.util.List;

public class Spec {

    String description;

    @Required
    List<ObjectReference> providerRefs;
}
