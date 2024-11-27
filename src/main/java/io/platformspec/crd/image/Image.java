package io.platformspec.crd.image;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

/**
 * The Image API kind in The Platform Specification represents a fundamental building block for your cloud platform, encompassing both container images and machine images (e.g. AMIs). It defines the source, versioning, and configuration details of these artifacts, ensuring consistent deployment across environments.
 * <a href="https://platformspec.io/docs/spec/spec.html#image">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("img")
public class Image extends CustomResource<Spec, Status> implements Namespaced {

}
