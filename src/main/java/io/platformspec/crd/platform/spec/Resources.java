package io.platformspec.crd.platform.spec;

import io.fabric8.kubernetes.api.model.ObjectReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Jacksonized
public class Resources {

    List<ObjectReference> environments;
    List<ObjectReference> providers;
    List<ObjectReference> clusters;
    List<ObjectReference> servers;
    List<ObjectReference> images;
    List<ObjectReference> softwareGroups;
    List<ObjectReference> credentials;
    List<ObjectReference> networks;
}
