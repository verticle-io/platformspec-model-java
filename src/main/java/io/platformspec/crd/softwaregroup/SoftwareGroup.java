package io.platformspec.crd.softwaregroup;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.platformspec.crd.PlatformResource;


/**
 * The SoftwareGroup API kind in The Platform Specification acts as a mechaism for defining and managing application software stacks across your platform. It encapsulates a collection of packages, configurations, and dependencies required to deploy and operate specific software components or applications consistently across different environments.
 * <a href="https://platformspec.io/docs/spec/spec.html#softwaregroup">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("swg")
public class SoftwareGroup extends CustomResource<Spec, Status> implements Namespaced, PlatformResource {

}
