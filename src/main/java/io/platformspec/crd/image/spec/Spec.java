package io.platformspec.crd.image.spec;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.image.spec.spec.Builder;

import java.util.List;

public class Spec {

    @JsonProperty("default")
    boolean isDefault;

    List<ObjectReference> providerRefs;
    List<ObjectReference> environmentRefs;
    String version;
    Builder builder;

}
