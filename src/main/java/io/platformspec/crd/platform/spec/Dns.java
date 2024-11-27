package io.platformspec.crd.platform.spec;

import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;

public class Dns {

    @Required
    ObjectReference providerRef;

    @Required
    String domain;
}
