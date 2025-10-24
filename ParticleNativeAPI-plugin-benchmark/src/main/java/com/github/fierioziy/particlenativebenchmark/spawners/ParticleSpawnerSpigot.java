package com.github.xap3y.particlenativebenchmark.spawners;

import com.github.xap3y.particlenativebenchmark.command.CommandPNAB;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class ParticleSpawnerSpigot implements ParticleSpawner {

    public ParticleSpawnerSpigot(CommandPNAB.Context context) {

    }

    @Override
    public void spawnParticle(Player player, double x, double y, double z) {
        player.spawnParticle(Particle.FLAME, x, y, z, 1, 0D, 0D, 0D, 0D);
    }

}
