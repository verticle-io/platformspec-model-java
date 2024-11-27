package io.platformspec.crd.cluster;

import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.cluster.spec.Config;

public class Spec {

    @Required
    ObjectReference providerRefs;

    @Required
    ObjectReference environmentRef;

    ObjectReference softwareGroupRefs;

    @Required
    String version;

    @Required
    String region;

    @PreserveUnknownFields
    Config config;
}