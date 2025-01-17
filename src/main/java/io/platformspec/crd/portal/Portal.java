package io.platformspec.crd.portal;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.platformspec.crd.PlatformResource;

/**
 * The Portal API kind in The Platform Specification represents a managed portal deployment.
 * <a href="https://platformspec.io/docs/spec/spec.html#portal">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("po")
public class Portal extends CustomResource<Spec, Status> implements Namespaced, PlatformResource {

}
