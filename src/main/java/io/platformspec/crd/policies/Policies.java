package io.platformspec.crd.policies;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

/**
 * The Policies API kind governs the operational and cost-management aspects of the platform. Policies may include logging, scaling, backups, or disaster recovery strategies. This ensures that critical governance and operational practices are well defined and consistently applied.
 * <a href="https://platformspec.io/docs/spec/spec.html#cluster">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("pol")
public class Policies extends CustomResource<Spec, Status> implements Namespaced {

}
