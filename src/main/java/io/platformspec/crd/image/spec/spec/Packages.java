package io.platformspec.crd.image.spec.spec;

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
public class Packages {

    String name;
    String version;

}
