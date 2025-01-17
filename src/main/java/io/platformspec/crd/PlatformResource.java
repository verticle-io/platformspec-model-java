package io.platformspec.crd;

/**
 * marker interface for any CustomResource being used in the PlatformSpec model
 */
public interface PlatformResource {
    PlatformResourceSpec getSpec();

    PlatformResourceStatus getStatus();
}
