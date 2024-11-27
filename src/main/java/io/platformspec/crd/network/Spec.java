package io.platformspec.crd.network;

import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.network.spec.CommonTypes;
import io.platformspec.crd.network.spec.Config;

import java.util.List;

public class Spec {

    CommonTypes type;

    //TODO add CustomTypes

    List<ObjectReference> providerRefs;

    @PreserveUnknownFields
    Config config;
}
