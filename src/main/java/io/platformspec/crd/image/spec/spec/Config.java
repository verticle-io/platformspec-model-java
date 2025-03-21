package io.platformspec.crd.image.spec.spec;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Config {
    String target;
    String location;

    @PreserveUnknownFields
    JsonNode options;
}
