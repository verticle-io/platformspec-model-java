package io.platformspec.crd.image.spec.spec;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Software {

    List<Packages> packages;
    List<Repos> repos;
}
