package io.platformspec.crd.environment;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
public class Spec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    String description;

    @Required
    List<ObjectReference> providerRefs;
}
