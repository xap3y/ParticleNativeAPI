package com.github.xap3y.particlenativeapi.core.asm.particle.type.v1_19_3;

import com.github.xap3y.particlenativeapi.core.asm.ContextASM;
import com.github.xap3y.particlenativeapi.core.asm.particle.type.v1_17.skeleton.ParticleTypeSkeletonASM_1_17;
import com.github.xap3y.particlenativeapi.core.asm.skeleton.ClassSkeleton;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class ParticleTypeRedstoneASM_1_19_3 extends ParticleTypeSkeletonASM_1_17 {

    public ParticleTypeRedstoneASM_1_19_3(ContextASM context) {
        super(context, ClassSkeleton.PARTICLE_TYPE_REDSTONE);
    }

    @Override
    protected void writeConstructors(ClassWriter cw) {
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC, "<init>",
                "()V", null, null);
        mv.visitCode();

        int local_this = 0;

        mv.visitVarInsn(ALOAD, local_this);
        mv.visitMethodInsn(INVOKESPECIAL,
                superType.internalName(),
                "<init>",
                "()V", false);

        mv.visitVarInsn(ALOAD, local_this);

        // this.particle = new ParticleParamRedstone(new Vector3f(1.0F, 0.0F, 0.0F), 1.0F);
        mv.visitTypeInsn(NEW, refs.particleParamRedstone_1_17.internalName());
        mv.visitInsn(DUP);

        mv.visitTypeInsn(NEW, refs.vector3f.internalName());
        mv.visitInsn(DUP);

        mv.visitInsn(FCONST_1);
        mv.visitInsn(FCONST_0);
        mv.visitInsn(FCONST_0);

        mv.visitMethodInsn(INVOKESPECIAL,
                refs.vector3f.internalName(),
                "<init>",
                "(FFF)V", false);

        mv.visitInsn(FCONST_1);

        mv.visitMethodInsn(INVOKESPECIAL,
                refs.particleParamRedstone_1_17.internalName(),
                "<init>",
                "(" + refs.vector3f.desc() + "F)V", false);

        mv.visitFieldInsn(PUTFIELD,
                implType.internalName(),
                PARTICLE_FIELD_NAME,
                refs.particleParam_1_17.desc());

        // this.packet = new ParticlePacketImpl_X();
        writePacketAssignment(mv);

        mv.visitInsn(RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    @Override
    protected void writeMethods(ClassWriter cw) {
        writeMethod_packet(cw);

        writeCommonMethods(cw);
    }

    /*
    Generates method that instantiates particle packet object
    with parameters passed to a method.
    Uses ParticleParamRedstone object stored in a field
    or creates new one if count equals 0.
     */
    private void writeMethod_packet(ClassWriter cw) {
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC,
                PACKET_METHOD_NAME,
                "(ZDDDDDDDI)" + refs.particlePacket.desc(), null, null);
        mv.visitCode();

        int local_this = 0;
        int local_far = 1;
        int local_x = 2;
        int local_y = 4;
        int local_z = 6;
        int local_offsetX = 8;
        int local_offsetY = 10;
        int local_offsetZ = 12;
        int local_speed = 14;
        int local_count = 16;
        int local_packet = 17;

        /*
        ParticlePacketImpl_X packet = this.packet;
         */
        mv.visitVarInsn(ALOAD, local_this);
        mv.visitFieldInsn(GETFIELD,
                implType.internalName(),
                PACKET_WRAPPER_FIELD_NAME,
                particlePacketImpl_X.desc());
        mv.visitVarInsn(ASTORE, local_packet);

        Label zeroCountLabel = new Label();

        // if (count != 0) {
        mv.visitVarInsn(ILOAD, local_count);
        mv.visitJumpInsn(IFEQ, zeroCountLabel);

        /*
        packetWrapper.setPacket(
            new PacketPlayOutWorldParticles(particle, far,
                x,               y,               z,
                (float) offsetX, (float) offsetY, (float) offsetZ,
                (float) speed, count),
                x, y, z
            )
        );
         */
        mv.visitVarInsn(ALOAD, local_packet);

        mv.visitTypeInsn(NEW, refs.packetPlayOutWorldParticles_1_17.internalName());
        mv.visitInsn(DUP);

        mv.visitVarInsn(ALOAD, local_this);
        mv.visitFieldInsn(GETFIELD,
                implType.internalName(),
                PARTICLE_FIELD_NAME,
                refs.particleParam_1_17.desc());

        mv.visitVarInsn(ILOAD, local_far);
        mv.visitVarInsn(DLOAD, local_x);
        mv.visitVarInsn(DLOAD, local_y);
        mv.visitVarInsn(DLOAD, local_z);
        mv.visitVarInsn(DLOAD, local_offsetX);mv.visitInsn(D2F);
        mv.visitVarInsn(DLOAD, local_offsetY);mv.visitInsn(D2F);
        mv.visitVarInsn(DLOAD, local_offsetZ);mv.visitInsn(D2F);
        mv.visitVarInsn(DLOAD, local_speed);mv.visitInsn(D2F);
        mv.visitVarInsn(ILOAD, local_count);

        mv.visitMethodInsn(INVOKESPECIAL,
                refs.packetPlayOutWorldParticles_1_17.internalName(),
                "<init>", "(" + refs.particleParam_1_17.desc() + "ZDDDFFFFI)V", false);

        mv.visitVarInsn(DLOAD, local_x);
        mv.visitVarInsn(DLOAD, local_y);
        mv.visitVarInsn(DLOAD, local_z);

        mv.visitMethodInsn(INVOKEVIRTUAL,
                particlePacketImpl_X.internalName(),
                SET_PACKET_METHOD_NAME,
                "(" + refs.packet_1_17.desc() + "DDD)V", false);

        // return packet;
        mv.visitVarInsn(ALOAD, local_packet);
        mv.visitInsn(ARETURN);

        // }
        mv.visitLabel(zeroCountLabel);

        /*
        packetWrapper.setPacket(
            new PacketPlayOutWorldParticles(
                new ParticleParamRedstone(new Vector3f((float) offsetX, (float) offsetY, (float) offsetZ), 1.0F),
                far,
                x, y, z,
                0.0F, 0.0F, 0.0F,
                0.0F, 1),
                x, y, z
            )
        );
         */
        mv.visitVarInsn(ALOAD, local_packet);

        mv.visitTypeInsn(NEW, refs.packetPlayOutWorldParticles_1_17.internalName());
        mv.visitInsn(DUP);

        // new ParticleParamRedstone(new Vector3fa((float) offsetX, (float) offsetY, (float) offsetZ), 1.0F);
        mv.visitTypeInsn(NEW, refs.particleParamRedstone_1_17.internalName());
        mv.visitInsn(DUP);

        mv.visitTypeInsn(NEW, refs.vector3f.internalName());
        mv.visitInsn(DUP);

        mv.visitVarInsn(DLOAD, local_offsetX);mv.visitInsn(D2F);
        mv.visitVarInsn(DLOAD, local_offsetY);mv.visitInsn(D2F);
        mv.visitVarInsn(DLOAD, local_offsetZ);mv.visitInsn(D2F);

        mv.visitMethodInsn(INVOKESPECIAL,
                refs.vector3f.internalName(),
                "<init>",
                "(FFF)V", false);

        mv.visitInsn(FCONST_1);

        mv.visitMethodInsn(INVOKESPECIAL,
                refs.particleParamRedstone_1_17.internalName(),
                "<init>",
                "(" + refs.vector3f.desc() + "F)V", false);

        mv.visitVarInsn(ILOAD, local_far);
        mv.visitVarInsn(DLOAD, local_x);
        mv.visitVarInsn(DLOAD, local_y);
        mv.visitVarInsn(DLOAD, local_z);
        mv.visitInsn(FCONST_0);
        mv.visitInsn(FCONST_0);
        mv.visitInsn(FCONST_0);
        mv.visitInsn(FCONST_0);
        mv.visitInsn(ICONST_1);

        mv.visitMethodInsn(INVOKESPECIAL,
                refs.packetPlayOutWorldParticles_1_17.internalName(),
                "<init>", "(" + refs.particleParam_1_17.desc() + "ZDDDFFFFI)V", false);

        mv.visitVarInsn(DLOAD, local_x);
        mv.visitVarInsn(DLOAD, local_y);
        mv.visitVarInsn(DLOAD, local_z);

        mv.visitMethodInsn(INVOKEVIRTUAL,
                particlePacketImpl_X.internalName(),
                SET_PACKET_METHOD_NAME,
                "(" + refs.packet_1_17.desc() + "DDD)V", false);

        // return packet;
        mv.visitVarInsn(ALOAD, local_packet);
        mv.visitInsn(ARETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

}
