package io.platformspec.crd.image.spec.spec;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Builder
@Jacksonized
public class Builder {
    String driver;
    Config config;
    Software software;

}
