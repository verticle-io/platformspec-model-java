package io.platformspec.crd.server;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.ProviderReferences;
import io.platformspec.crd.ResourceReference;
import io.platformspec.crd.ResourceReferences;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@Data
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    @Required
    @ProviderReferences
    public List<ObjectReference> providerRefs;

    @Required
    @ResourceReference
    public ObjectReference environmentRef;

    @Required
    String region;

    @ResourceReferences
    public List<ObjectReference> networkRefs;

    @PreserveUnknownFields
    JsonNode config;
}
