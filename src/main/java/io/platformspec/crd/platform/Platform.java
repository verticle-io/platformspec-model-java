package io.platformspec.crd.platform;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

/**
 * The Platform CRD in The Platform Specification serves as the central entrypoint for your entire cloud platform, encompassing all its components, configurations, and policies. It provides a structured framework for defining and managing your infrastructure, services, and resources across different environments.
 * <a href="https://platformspec.io/docs/spec/spec.html#platform">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("pf")
public class Platform extends CustomResource<Spec, Status> implements Namespaced {


}
