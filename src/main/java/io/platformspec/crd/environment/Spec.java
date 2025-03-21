package io.platformspec.crd.environment;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.PlatformResourceSpec;
import io.platformspec.crd.ProviderReferences;
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

    String description;

    @Required
    @JsonPropertyDescription("list of Provider ObjectReferences")
    @ProviderReferences
    public List<ObjectReference> providerRefs;
}
