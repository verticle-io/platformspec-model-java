package io.platformspec.crd.credential;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.generator.annotation.Required;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.credential.spec.Schema;
import io.platformspec.crd.credential.spec.Sources;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Jacksonized
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    Schema schema;

    @Required
    Sources source;

    @PreserveUnknownFields
    JsonNode fields;

}
