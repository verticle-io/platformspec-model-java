package io.platformspec.crd.platform.spec;

import io.fabric8.kubernetes.api.model.ObjectReference;

import java.util.List;

public class Resources {

    List<ObjectReference> environments;
    List<ObjectReference> providers;
    List<ObjectReference> clusters;
    List<ObjectReference> servers;
    List<ObjectReference> images;
    List<ObjectReference> softwareGroups;
    List<ObjectReference> credentials;
}
