package io.platformspec.crd;

/**
 * marker interface for any CustomResource being used in the PlatformSpec model
 */
public interface PlatformResource {
    PlatformResourceSpec getSpec();

    default PlatformResourceStatus getStatus(){
        return new DefaultStatus();
    }
}
