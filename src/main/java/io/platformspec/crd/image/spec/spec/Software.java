package io.platformspec.crd.image.spec.spec;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
public class Software {

    List<Packages> packages;
    List<Repos> repos;
}
