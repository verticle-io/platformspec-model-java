package io.platformspec.crd;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ObjectReference;

import java.time.ZonedDateTime;
import java.util.List;

public interface PlatformResourceStatus {
    ObjectReference getClaimedBy();
    JsonNode getServiceProviderStatus();
    List<Condition> getConditions();
    ZonedDateTime getProvisionedAt();

    void setClaimedBy(ObjectReference reference);
    void setServiceProviderStatus(JsonNode jsonNode);
    void setConditions(List<Condition> conditions);
    void setProvisionedAt(ZonedDateTime timestamp);
}
