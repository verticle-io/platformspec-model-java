package io.platformspec.crd.credential;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.generator.annotation.Required;
import io.platformspec.crd.credential.spec.Schema;
import io.platformspec.crd.credential.spec.Sources;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
public class Spec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    Schema schema;

    @Required
    Sources source;

    @PreserveUnknownFields
    JsonNode fields;

}
