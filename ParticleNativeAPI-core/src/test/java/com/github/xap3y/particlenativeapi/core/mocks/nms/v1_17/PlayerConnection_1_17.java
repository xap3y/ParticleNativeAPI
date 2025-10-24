package com.github.xap3y.particlenativeapi.core.mocks.nms.v1_17;

import com.github.xap3y.particlenativeapi.core.mocks.nms.common.Packet;

import java.util.Optional;

public class PlayerConnection_1_17 {

    public PlayerConnection_1_17() {}

    /*
     * Some spigot/bukkit forks contains lambda method with matching types
     * same as send(Packet) method.
     * Here, this certain behavior is reproduced.
     *
     * Compiler will generate a synthetic method representing lambda
     * with same signature as sendPacket(Packet) method.
     */

    public void doLambdaStuff() {
        Optional.<Packet>empty().ifPresent(packet -> {
            String quack = "Moo";
        });
    }

    // required
    public void sendPacket(Packet packet) {}
}
