package io.platformspec.crd.provider;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

/**
 * The Provider API kind defines the specific cloud provider or service used for managing infrastructure and platform components within your environment. Providers offer pre-configured integrations and functionalities tailored to their respective platforms, simplifying deployment and management.
 * <a href="https://platformspec.io/docs/spec/spec.html#provider">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("prov")
public class Provider extends CustomResource<Spec, Status> implements Namespaced {

}
