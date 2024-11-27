package io.platformspec.crd.image.spec.spec;

import io.fabric8.crd.generator.annotation.PreserveUnknownFields;

public class Config {
    String target;
    String location;

    @PreserveUnknownFields
    Options options;
}
