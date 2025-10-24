package com.github.xap3y.particlenativeapi.core.particle.type;

import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeBlockMotion;
import com.github.xap3y.particlenativeapi.api.particle.type.ParticleTypeMotion;
import com.github.xap3y.particlenativeapi.api.utils.ParticleException;
import org.bukkit.Material;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ParticleTypeBlockMotionTest {

    @Spy
    private ParticleTypeBlockMotion invalidParticleType = new ParticleTypeBlockMotionImpl();

    @Spy
    private ParticleTypeBlockMotion particleType = new ParticleTypeBlockMotionImpl();

    @BeforeEach
    public void prepareParticleType() {
        // make it look like valid
        doReturn(true).when(particleType).isPresent();

        // make it return dummy particle type on 'of' method
        // to avoid ParticleException
        lenient()
                .doReturn(mock(ParticleTypeMotion.class))
                .when(particleType)
                .of(any(Material.class), anyByte());


        assertFalse(invalidParticleType.isPresent(),
                "Invalid ParticleType is for some reason valid");

        assertTrue(particleType.isPresent(),
                "ParticleType is for some reason invalid");
    }

    /*
    Verify invalid particle type
     */

    @Test
    public void testExceptionOnInvalidType() {
        assertThrows(ParticleException.class, () -> invalidParticleType.of(Material.DIAMOND_BLOCK, (byte) 0));
    }

    /*
    Verify method argument expansion
     */

    @Test
    public void test_of_Material() {
        Material targetMat = Material.DIAMOND_BLOCK;
        byte targetByte = 0;

        particleType.of(targetMat);

        verify(particleType).of(targetMat, targetByte);
    }

    @Test
    public void test_of_Material_Int() {
        Material targetMat = Material.DIAMOND_BLOCK;
        byte targetByte = 2;

        particleType.of(targetMat, (int) targetByte);

        verify(particleType).of(targetMat, targetByte);
    }

}
