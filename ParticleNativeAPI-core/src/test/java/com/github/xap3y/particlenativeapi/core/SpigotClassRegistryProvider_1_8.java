package com.github.xap3y.particlenativeapi.core;

import com.github.xap3y.particlenativeapi.core.asm.mapping.SpigotClassRegistry;
import com.github.xap3y.particlenativeapi.core.asm.mapping.SpigotClassRegistryProvider;
import com.github.xap3y.particlenativeapi.core.mocks.nms.common.Packet;
import com.github.xap3y.particlenativeapi.core.mocks.nms.v1_7.EntityPlayer_1_7;
import com.github.xap3y.particlenativeapi.core.mocks.nms.v1_7.PlayerConnection_1_7;
import com.github.xap3y.particlenativeapi.core.mocks.nms.v1_8.EnumParticle;
import com.github.xap3y.particlenativeapi.core.mocks.nms.v1_8.PacketPlayOutWorldParticles_1_8;
import com.github.xap3y.particlenativeapi.core.mocks.obc.v1_7.entity.CraftPlayer_1_7;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SpigotClassRegistryProvider_1_8 implements SpigotClassRegistryProvider {

    public SpigotClassRegistry provideRegistry() {
        SpigotClassRegistry classRegistry = new SpigotClassRegistry();

        // Spigot
        classRegistry.material =                                    classRegistry.of(Material.class);
        classRegistry.blockData =                                   classRegistry.EMPTY_MAPPING;
        classRegistry.itemStackBukkit =                             classRegistry.of(ItemStack.class);

        // OBC
        classRegistry.craftPlayer =                                 classRegistry.of(CraftPlayer_1_7.class);

        // NMS
        classRegistry.enumParticle =                                classRegistry.of(EnumParticle.class);

        /*
        pre 1.17
         */
        classRegistry.entityPlayer_1_7 =                            classRegistry.of(EntityPlayer_1_7.class);
        classRegistry.packet_1_7 =                                  classRegistry.of(Packet.class);
        classRegistry.playerConnection_1_7 =                        classRegistry.of(PlayerConnection_1_7.class);

        classRegistry.packetPlayOutWorldParticles_1_7 =             classRegistry.of(PacketPlayOutWorldParticles_1_8.class);

        return classRegistry;
    }

}
