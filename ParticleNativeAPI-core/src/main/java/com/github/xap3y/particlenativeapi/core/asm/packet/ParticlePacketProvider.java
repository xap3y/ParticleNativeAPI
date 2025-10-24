package com.github.xap3y.particlenativeapi.core.asm.packet;

import com.github.xap3y.particlenativeapi.core.asm.BaseASM;
import com.github.xap3y.particlenativeapi.core.asm.ContextASM;

public abstract class ParticlePacketProvider extends BaseASM {

    public ParticlePacketProvider(ContextASM context) {
        super(context);
    }

    public abstract void registerClasses();

}
