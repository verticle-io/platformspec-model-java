package io.platformspec.crd.platform.spec;

import io.fabric8.kubernetes.api.model.ObjectReference;
import io.platformspec.crd.CredentialReferences;
import io.platformspec.crd.ProviderReferences;
import io.platformspec.crd.ResourceReferences;
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
public class Resources {

    @ResourceReferences
    public List<ObjectReference> environments;
    @ProviderReferences
    public List<ObjectReference> providers;
    @ResourceReferences
    public List<ObjectReference> clusters;
    @ResourceReferences
    public List<ObjectReference> servers;
    @ResourceReferences
    public List<ObjectReference> images;
    @ResourceReferences
    public List<ObjectReference> softwareGroups;
    @CredentialReferences
    public List<ObjectReference> credentials;
    @ResourceReferences
    public List<ObjectReference> networks;
}
