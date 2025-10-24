package com.github.xap3y.particlenativeapi.api.particle.type;

import com.github.xap3y.particlenativeapi.api.utils.Shared;

/**
 * <p>Class used to represent sculk charge particle type that takes a roll parameter.</p>
 *
 * <p>It provides a non-reflective <code>of</code> method overloads
 * to construct <code>ParticleTypeMotion</code> with selected item type.</p>
 *
 * <p>All <code>of</code> methods does not validate parameters in any way.</p>
 *
 * <p><b>IMPORTANT NOTE</b>: All methods annotated with {@link Shared} annotation
 * caches and returns exactly one and the same instance with changed state between method calls.
 * For an independent copy of returned instances, check <code>detachCopy</code> methods on them.</p>
 *
 * @see ParticleTypeMotion
 */
public interface ParticleTypeSculkChargeMotion {

    /**
     * <p>Selects roll angle this particle should be rotated.
     * An angle is in radians and will rotate particle clockwise</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p><b>This method is overridden by dynamically generated
     * subclasses.</b></p>
     *
     * @param roll angle in radians by which to rotate particle clockwise.
     * @return a valid {@link ParticleTypeMotion} object with selected
     * roll angle.
     */
    @Shared ParticleTypeMotion roll(double roll);

    /**
     * <p>Checks if this particle is supported by this Spigot version.</p>
     *
     * <p><b>This method is overridden by dynamically generated
     * subclasses.</b></p>
     *
     * @return true if this particle is supported by
     * this Spigot version, false otherwise.
     */
    boolean isPresent();

}
