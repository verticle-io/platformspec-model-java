package io.platformspec.crd.status;

import io.fabric8.kubernetes.api.model.Condition;

public class SelectableCondition extends Condition {

    public enum Type {
        matched, claimed, released
    }
}
