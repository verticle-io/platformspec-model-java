package io.platformspec.crd.softwaregroup.spec;

import io.fabric8.crd.generator.annotation.PreserveUnknownFields;

public class Packages {

    String name;
    Engine engine;

    @PreserveUnknownFields
    Config config;
}
