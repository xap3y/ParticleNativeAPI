package com.github.xap3y.particlenativebenchmark.spawners;

import com.github.xap3y.particlenativeapi.api.ParticleNativeAPI;
import com.github.xap3y.particlenativebenchmark.command.CommandPNAB;
import org.bukkit.entity.Player;

public class ParticleSpawnerPNA implements ParticleSpawner {

    private final ParticleNativeAPI particleApi;

    public ParticleSpawnerPNA(CommandPNAB.Context context) {
        this.particleApi = context.getParticleApi();
    }

    @Override
    public void spawnParticle(Player player, double x, double y, double z) {
        particleApi.LIST_1_8.FLAME
                .packet(true, x, y, z)
                .sendTo(player);
    }

}
