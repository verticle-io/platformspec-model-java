package io.platformspec.crd.environment;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.platformspec.crd.PlatformResource;

/**
 * The Environment API kind in The Platform Specification represents a distinct deployment ecosystems within your platform, such as development, testing, staging, or production. It defines the specific configurations and resources required for deploying and managing applications and services within that particular environment.
 * <a href="https://platformspec.io/docs/spec/spec.html#environment">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("env")
public class Environment extends CustomResource<Spec, Status> implements Namespaced, PlatformResource {

}
