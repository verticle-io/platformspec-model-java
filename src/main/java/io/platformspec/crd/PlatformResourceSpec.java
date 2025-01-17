package io.platformspec.crd;

/**
 * marker interface for any CustomResource Spec being used in the PlatformSpec model
 */
public interface PlatformResourceSpec {
    String getLabelSelector();
}
