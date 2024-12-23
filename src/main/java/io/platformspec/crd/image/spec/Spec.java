package io.platformspec.crd.image.spec;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.image.spec.spec.Builder;
import io.platformspec.crd.image.spec.spec.Reference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Builder
@Jacksonized
@Data
public class Spec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    @JsonProperty("default")
    boolean isDefault;

    List<ObjectReference> providerRefs;
    List<ObjectReference> environmentRefs;
    String version;
    Builder builder;
    Reference reference;

}
