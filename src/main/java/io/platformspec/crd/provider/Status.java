package io.platformspec.crd.provider;

import com.fasterxml.jackson.databind.JsonNode;
import io.fabric8.crd.generator.annotation.PreserveUnknownFields;
import io.fabric8.crd.generator.annotation.PrinterColumn;
import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ObjectReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Status {

    @PrinterColumn(name = "claimed by", priority = 0)
    ObjectReference claimedBy;

    @PreserveUnknownFields
    JsonNode serviceProviderStatus;

    List<Condition> conditions = new ArrayList<>();

    @PrinterColumn(name = "provisioned at", priority = 0)
    ZonedDateTime provisionedAt;


}
