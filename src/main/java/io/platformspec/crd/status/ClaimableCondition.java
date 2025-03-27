package io.platformspec.crd.status;

import io.fabric8.kubernetes.api.model.Condition;

public class ClaimableCondition extends Condition {

    public enum Type {
        matching, matching_failed, matched, claiming, claimed
    }
}
