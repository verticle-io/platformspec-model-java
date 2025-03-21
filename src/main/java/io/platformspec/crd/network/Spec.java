package io.platformspec.crd.network;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.ProviderReferences;
import io.platformspec.crd.network.spec.CommonTypes;
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

    CommonTypes type;

    //TODO add CustomTypes

    @ProviderReferences
    public List<ObjectReference> providerRefs;

    @PreserveUnknownFields
    JsonNode config;
}
