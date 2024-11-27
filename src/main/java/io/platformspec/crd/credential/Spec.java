package io.platformspec.crd.credential;

import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.generator.annotation.Required;
import io.platformspec.crd.credential.spec.Field;
import io.platformspec.crd.credential.spec.Schema;
import io.platformspec.crd.credential.spec.Sources;

public class Spec {

    Schema schema;

    @Required
    Sources source;

    @PreserveUnknownFields
    Field fields;

}
