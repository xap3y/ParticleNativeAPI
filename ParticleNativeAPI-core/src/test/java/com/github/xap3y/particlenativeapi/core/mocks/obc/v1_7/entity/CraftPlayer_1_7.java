package com.github.xap3y.particlenativeapi.core.mocks.obc.v1_7.entity;

import com.github.xap3y.particlenativeapi.core.mocks.nms.v1_7.EntityPlayer_1_7;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/*
It has to be abstract, we don't want to implement tons of Player's methods.
 */
public abstract class CraftPlayer_1_7 implements Player {

    public String name;
    public EntityPlayer_1_7 ep;

    public CraftPlayer_1_7() {}

    // required
    public EntityPlayer_1_7 getHandle() {
        return ep;
    }

    // required
    @Override
    public Location getLocation() {
        return new Location(null, ep.x, ep.y, ep.z);
    }

    @Override
    public String getName() {
        return name;
    }

}
