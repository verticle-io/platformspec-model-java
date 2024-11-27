package io.platformspec.crd.network;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;
import io.platformspec.crd.image.Status;

/**
 * The Network API kind provides a standardized way to define and manage various types of network infrastructures within your platform. Whether it's a traditional VPC, a VPN tunnel, an overlay network, or any other custom connectivity model, this resource encapsulates the essential configurations required for reliable and secure communication across your cloud environments.
 * <a href="https://platformspec.io/docs/spec/spec.html#network">spec</a>
 */
@Group("core.platformspec.io")
@Version("v1alpha1")
@ShortNames("net")
public class Network  extends CustomResource<Spec, Status> implements Namespaced {

}
