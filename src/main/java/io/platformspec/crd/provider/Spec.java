package io.platformspec.crd.provider;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.provider.spec.Categories;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
public class Spec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    @PrinterColumn(name = "category", priority = 0)
    Categories category;

    @PrinterColumn(name = "engine", priority = 0)
    String engine;

    ObjectReference credentialRef;

    @PreserveUnknownFields
    JsonNode config;
}
