package io.platformspec.crd.server;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

/**
 * The Cluster API kind in The Platform Specification represents a managed cluster deployment, encapsulating all necessary configurations to provision and manage your infrastructure within a specific environment.
 * <a href="https://platformspec.io/docs/spec/spec.html#server">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("srv")
public class Server  extends CustomResource<Spec, Status> implements Namespaced {
}
