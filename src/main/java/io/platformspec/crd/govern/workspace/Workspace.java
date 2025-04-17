package io.platformspec.crd.govern.workspace;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.platformspec.crd.PlatformResource;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Group("govern.platformspec.io")
@Version("v1alpha1")
@ShortNames("ws")
@FieldDefaults(level= AccessLevel.PUBLIC)
public class Workspace extends CustomResource<Spec, Status> implements Namespaced, PlatformResource {
}
