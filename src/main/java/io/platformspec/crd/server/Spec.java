package io.platformspec.crd.server;

import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.server.spec.Config;

import java.util.List;

public class Spec {

    @Required
    List<ObjectReference> providerRefs;

    @Required
    ObjectReference environmentRef;

    @Required
    String region;

    String network;

    Config config;
}
