package com.github.xap3y.particlenativeapi.api.particle.type;

import com.github.xap3y.particlenativeapi.api.packet.ParticlePacket;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;
import com.github.xap3y.particlenativeapi.api.utils.Shared;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.util.Vector;

/**
 * <p>Class used to represent particle type that can construct
 * colored particle packet.</p>
 *
 * <p>It provides a non-reflective <code>packetColored</code>
 * and <code>packet</code> method overloads
 * to construct particle packet with desired parameters.</p>
 *
 * <p>All <code>packetColored</code> and <code>packet</code> methods does not validate parameters in any way.</p>
 *
 * <p><b>IMPORTANT NOTE</b>: All methods annotated with {@link Shared} annotation
 * caches and returns exactly one and the same instance with changed state between method calls.
 * For an independent copy of returned instances, check <code>detachCopy</code> methods on them.</p>
 *
 * @see ParticleType
 */
public interface ParticleTypeColorable extends ParticleType {

    /**
     * <p>Makes an independent from previously called particle type, copy of this particle type.</p>
     * <p>Returned instance can be cached and reused.</p>
     *
     * @return an independent copy of this selected particle type.
     */
    @Override
    ParticleTypeColorable detachCopy();

    /**
     * <p>Construct particle packet that will
     * spawn 1 colored particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeColorable#isPresent()} method.</p>
     *
     * @param far   if true, packets will be rendered much further
     *              than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc   a {@link Location} containing position.
     * @param color a {@link Color} object with color parameters.
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packetColored(boolean far, Location loc,
                                         Color color);

    /**
     * <p>Construct particle packet that will
     * spawn 1 colored particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeColorable#isPresent()} method.</p>
     *
     * @param far   if true, packets will be rendered much further
     *              than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc   a {@link Vector} containing position.
     * @param color a {@link Color} object with color parameters.
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packetColored(boolean far, Vector loc,
                                         Color color);

    /**
     * <p>Construct particle packet that will
     * spawn 1 colored particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeColorable#isPresent()} method.</p>
     *
     * @param far   if true, packets will be rendered much further
     *              than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x     component of a position.
     * @param y     component of a position.
     * @param z     component of a position.
     * @param color a {@link Color} object with color parameters.
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packetColored(boolean far, double x, double y, double z,
                                         Color color);

    /**
     * <p>Construct particle packet that will
     * spawn 1 colored particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeColorable#isPresent()} method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a {@link Location} containing position.
     * @param r   red color value that should be between 0 and 255.
     * @param g   green color value that should be between 0 and 255.
     * @param b   blue color value that should be between 0 and 255.
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packetColored(boolean far, Location loc,
                                         int r, int g, int b);

    /**
     * <p>Construct particle packet that will
     * spawn 1 colored particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeColorable#isPresent()} method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc a {@link Vector} containing position.
     * @param r   red color value that should be between 0 and 255.
     * @param g   green color value that should be between 0 and 255.
     * @param b   blue color value that should be between 0 and 255.
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packetColored(boolean far, Vector loc,
                                         int r, int g, int b);

    /**
     * <p>Construct particle packet that will
     * spawn 1 colored particle at specified position.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeColorable#isPresent()} method.</p>
     *
     * @param far if true, packets will be rendered much further
     *            than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x   component of a position.
     * @param y   component of a position.
     * @param z   component of a position.
     * @param r   red color value that should be between 0 and 255.
     * @param g   green color value that should be between 0 and 255.
     * @param b   blue color value that should be between 0 and 255.
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packetColored(boolean far, double x, double y, double z,
                                         int r, int g, int b);

}
