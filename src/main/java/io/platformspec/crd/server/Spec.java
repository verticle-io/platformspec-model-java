package io.platformspec.crd.server;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
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

    @Required
    List<ObjectReference> providerRefs;

    @Required
    ObjectReference environmentRef;

    @Required
    String region;

    List<ObjectReference> networkRefs;

    @PreserveUnknownFields
    JsonNode config;
}
