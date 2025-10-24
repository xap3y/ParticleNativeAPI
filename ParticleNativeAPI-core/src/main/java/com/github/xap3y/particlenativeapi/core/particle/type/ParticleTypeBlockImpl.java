package com.github.xap3y.particlenativeapi.core.particle.type;

import com.github.xap3y.particlenativeapi.api.particle.type.ParticleType;
import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeBlock;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;
import org.bukkit.Material;

public class ParticleTypeBlockImpl implements ParticleTypeBlock {

    @Override
    public ParticleType of(Material block) {
        return of(block, (byte) 0);
    }

    @Override
    public ParticleType of(Material block, int meta) {
        return of(block, (byte) meta);
    }

    @Override
    public ParticleType of(Material block, byte meta) {
        throw new ParticleException(
                "Requested particle type is not supported by this server version!"
        );
    }

    @Override
    public boolean isPresent() {
        return false;
    }

}
