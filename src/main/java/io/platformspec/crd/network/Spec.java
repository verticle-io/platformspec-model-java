package io.platformspec.crd.network;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.network.spec.CommonTypes;
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
public class Spec implements PlatformResourceSpec {

    @PrinterColumn(name = "selector", priority = 0)
    protected String labelSelector;

    CommonTypes type;

    //TODO add CustomTypes

    List<ObjectReference> providerRefs;

    @PreserveUnknownFields
    JsonNode config;
}
