package io.platformspec.crd.image.spec.spec;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Builder
@Jacksonized
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Builder {
    String driver;
    Config config;
    Software software;

}
