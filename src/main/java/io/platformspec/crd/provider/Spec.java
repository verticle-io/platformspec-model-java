package io.platformspec.crd.provider;

import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.kubernetes.api.model.Config;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.provider.spec.Categories;

public class Spec {

    Categories category;
    String engine;
    ObjectReference credentialRef;

    @PreserveUnknownFields
    Config config;
}
