package com.github.xap3y.particlenativeapi.core.particle.type;

import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeItemMotion;
import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeMotion;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;
import org.bukkit.Material;

public class ParticleTypeItemMotionImpl implements ParticleTypeItemMotion {

    public ParticleTypeMotion of(Material item) {
        throw new ParticleException(
                "Requested particle type is not supported by this server version!"
        );
    }

    public boolean isPresent() {
        return false;
    }

}
