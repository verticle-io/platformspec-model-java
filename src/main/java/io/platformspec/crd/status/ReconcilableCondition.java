package io.platformspec.crd.status;

import io.fabric8.kubernetes.api.model.Condition;

public class ReconcilableCondition extends Condition {

    public enum Type {
        reconciling, reconciled
    }
}
