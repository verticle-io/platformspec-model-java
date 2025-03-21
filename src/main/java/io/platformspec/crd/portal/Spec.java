package io.platformspec.crd.portal;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.ResourceReference;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    @PreserveUnknownFields
    JsonNode config;

    @ResourceReference
    public ObjectReference repositoryProviderRef;
}
