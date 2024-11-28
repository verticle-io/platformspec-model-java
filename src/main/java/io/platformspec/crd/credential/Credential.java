package io.platformspec.crd.credential;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

/**
 * The credentials API kind in the Platform Specification defines how authentication credentials are managed for various cloud services. This allows for flexible configuration and secure storage of sensitive information.
 * <a href="https://platformspec.io/docs/spec/spec.html#cluster">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("cred")
public class Credential extends CustomResource<Spec, Status> implements Namespaced {

}
