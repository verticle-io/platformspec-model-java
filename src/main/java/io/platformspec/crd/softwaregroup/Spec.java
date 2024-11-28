package io.platformspec.crd.softwaregroup;

import io.platformspec.crd.softwaregroup.spec.Packages;
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

    List<Packages> packages;
}
