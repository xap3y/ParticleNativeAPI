package com.github.xap3y.particlenativeapi.api.particle.type;

import com.github.xap3y.particlenativeapi.api.packet.ParticlePacket;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;
import com.github.xap3y.particlenativeapi.api.utils.Shared;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

/**
 * <p>Class used to represent vibration particle type since MC 1.17.</p>
 *
 * <p>It provides a non-reflective <code>packet</code> method overloads
 * to construct particle packet with desired parameters.</p>
 *
 * <p>All <code>packet</code> methods does not validate parameters in any way.</p>
 *
 * <p><b>IMPORTANT NOTE</b>: All methods annotated with {@link Shared} annotation
 * caches and returns exactly one and the same instance with changed state between method calls.
 * For an independent copy of returned instances, check <code>detachCopy</code> methods on them.</p>
 */
public interface ParticleTypeVibrationSingle {

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target position.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far    if true, packets will be rendered much further
     *               than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc    a {@link Location} containing position.
     * @param target a {@link Location} containing target position.
     * @param ticks  flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, Location loc, Location target, int ticks);

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target position.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far    if true, packets will be rendered much further
     *               than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc    a {@link Location} containing position.
     * @param target a {@link Vector} containing target position.
     * @param ticks  flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, Location loc, Vector target, int ticks);

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target entity.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far          if true, packets will be rendered much further
     *                     than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc          a {@link Location} containing position.
     * @param targetEntity an {@link Entity}.
     * @param ticks        flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, Location loc, Entity targetEntity, int ticks);

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target position.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far    if true, packets will be rendered much further
     *               than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc    a {@link Vector} containing position.
     * @param target a {@link Location} containing target position.
     * @param ticks  flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, Vector loc, Location target, int ticks);

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target position.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far    if true, packets will be rendered much further
     *               than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc    a {@link Vector} containing position.
     * @param target a {@link Vector} containing target position.
     * @param ticks  flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, Vector loc, Vector target, int ticks);

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target entity.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far          if true, packets will be rendered much further
     *                     than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param loc          a {@link Vector} containing position.
     * @param targetEntity an {@link Entity}.
     * @param ticks        flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, Vector loc, Entity targetEntity, int ticks);

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target position.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p><b>This method is overridden by dynamically generated
     * subclasses.</b></p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far     if true, packets will be rendered much further
     *                than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x       component of a position.
     * @param y       component of a position.
     * @param z       component of a position.
     * @param targetX component of a target position.
     * @param targetY component of a target position.
     * @param targetZ component of a target position.
     * @param ticks   flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, double x, double y, double z,
                                  double targetX, double targetY, double targetZ,
                                  int ticks);

    /**
     * <p>Construct particle packet that will
     * spawn 1 vibration particle at specified position
     * flying toward target entity.</p>
     *
     * <p>Currently, positions are aligned to block centers.</p>
     *
     * <p>Parameters are not validated in any way.</p>
     *
     * <p><b>This method is overridden by dynamically generated
     * subclasses.</b></p>
     *
     * <p>It is wise to check, if particle is supported by current Spigot version
     * using {@link ParticleTypeVibrationSingle#isPresent()} method.</p>
     *
     * @param far          if true, packets will be rendered much further
     *                     than 16 blocks (flag is ignored prior to MC 1.8 versions).
     * @param x            component of a position.
     * @param y            component of a position.
     * @param z            component of a position.
     * @param targetEntity target entity.
     * @param ticks        flight duration (in ticks).
     * @return an NMS <code>Packet</code> wrapped in shared {@link ParticlePacket} object.
     * @throws ParticleException when requested particle type
     *                           is not supported by this server version.
     */
    @Shared ParticlePacket packet(boolean far, double x, double y, double z,
                                  Entity targetEntity, int ticks);

    /**
     * <p>Checks if this particle is supported by this Spigot version.</p>
     *
     * <p><b>This method is overridden by dynamically generated
     * subclasses.</b></p>
     *
     * @return true if this particle is supported by
     * this Spigot version, false otherwise.
     */
    boolean isPresent();

}
