package com.github.xap3y.particlenativeapi.core.particle.type;

import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeMotion;
import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeSculkChargeMotion;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;

public class ParticleTypeSculkChargeMotionImpl implements ParticleTypeSculkChargeMotion {

    @Override
    public ParticleTypeMotion roll(double roll) {
        throw new ParticleException(
                "Requested particle type is not supported by this server version!"
        );
    }

    @Override
    public boolean isPresent() {
        return false;
    }

}
