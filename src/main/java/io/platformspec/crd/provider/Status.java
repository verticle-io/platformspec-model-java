package io.platformspec.crd.provider;

import io.fabric8.crd.generator.annotation.PrinterColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Status {

    @PrinterColumn(name = "available", priority = 0)
    boolean available;

    @PrinterColumn(name = "provisioned", priority = 0)
    boolean isProvisioned = false;
    ZonedDateTime provisionedAt;
    ZonedDateTime unprovisionedAt;
}
