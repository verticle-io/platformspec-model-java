package io.platformspec.crd;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ObjectReference;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * marker interface for any CustomResource status being used in the PlatformSpec model
 */
public interface PlatformResourceStatus {
    ObjectReference getClaimedBy();

    void setClaimedBy(ObjectReference reference);

    JsonNode getServiceProviderStatus();

    void setServiceProviderStatus(JsonNode jsonNode);

    List<Condition> getConditions();

    void setConditions(List<Condition> conditions);

    ZonedDateTime getProvisionedAt();

    void setProvisionedAt(ZonedDateTime timestamp);
}
