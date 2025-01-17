package io.platformspec.crd.cluster;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.platformspec.crd.PlatformResource;

/**
 * The Cluster API kind in The Platform Specification represents a managed cluster deployment, encapsulating all necessary configurations to provision and manage your infrastructure within a specific environment.
 * <a href="https://platformspec.io/docs/spec/spec.html#cluster">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("cl")
public class Cluster extends CustomResource<Spec, Status> implements Namespaced, PlatformResource {

}
