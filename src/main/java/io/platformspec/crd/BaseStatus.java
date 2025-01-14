package io.platformspec.crd;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ObjectReference;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
public abstract class BaseStatus implements PlatformResourceStatus {

    @PrinterColumn(name = "claimed by", priority = 0)
    ObjectReference claimedBy;

    @PreserveUnknownFields
    JsonNode serviceProviderStatus;

    @Builder.Default
    List<Condition> conditions = new ArrayList<>();

    @PrinterColumn(name = "provisioned at", priority = 0)
    ZonedDateTime provisionedAt;


}
