package io.platformspec.crd.status;

import io.fabric8.kubernetes.api.model.Condition;

public class ProvisionableCondition extends Condition {

    public enum Type {
        provisioning, provisioned, unprovisioned, unprovisioning
    }
}
