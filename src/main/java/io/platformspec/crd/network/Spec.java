package io.platformspec.crd.network;

import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.network.spec.Config;
import io.platformspec.crd.network.spec.Types;

import java.util.List;

public class Spec {
    Types type;
    List<ObjectReference> providerRefs;

    @PreserveUnknownFields
    Config config;
}
