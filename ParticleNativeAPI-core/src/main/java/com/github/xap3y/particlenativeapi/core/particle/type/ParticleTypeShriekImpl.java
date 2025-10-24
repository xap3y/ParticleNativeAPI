package com.github.xap3y.particlenativeapi.core.particle.type;

import com.github.xap3y.particlenativeapi.api.particle.type.ParticleType;
import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeShriek;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;

public class ParticleTypeShriekImpl implements ParticleTypeShriek {

    @Override
    public ParticleType delay(int delay) {
        throw new ParticleException(
                "Requested particle type is not supported by this server version!"
        );
    }

    @Override
    public boolean isPresent() {
        return false;
    }

}
