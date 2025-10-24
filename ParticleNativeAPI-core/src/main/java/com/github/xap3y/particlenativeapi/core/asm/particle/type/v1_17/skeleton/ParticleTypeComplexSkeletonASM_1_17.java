package com.github.xap3y.particlenativeapi.core.asm.particle.type.v1_17.skeleton;

import com.github.xap3y.particlenativeapi.core.asm.ContextASM;
import com.github.xap3y.particlenativeapi.core.asm.particle.type.skeleton.ParticleTypeComplexSkeletonASM;
import com.github.xap3y.particlenativeapi.core.asm.skeleton.ClassSkeleton;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

public abstract class ParticleTypeComplexSkeletonASM_1_17 extends ParticleTypeComplexSkeletonASM {

    public ParticleTypeComplexSkeletonASM_1_17(ContextASM context,
                                               ClassSkeleton superType, ClassSkeleton returnType) {
        super(context, superType, returnType);
    }

    @Override
    protected void writeFields(ClassWriter cw) {
        cw.visitField(ACC_PRIVATE, PARTICLE_FIELD_NAME, refs.particle_1_17.desc(), null, null).visitEnd();

        writeParticleTypeField(cw);
    }

    @Override
    protected void writeConstructors(ClassWriter cw) {
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC, "<init>",
                                          "(" + refs.particle_1_17.desc() + ")V", null, null);
        mv.visitCode();

        int local_this = 0;
        int local_particle = 1;

        mv.visitVarInsn(ALOAD, local_this);
        mv.visitMethodInsn(INVOKESPECIAL,
                           superType.internalName(),
                           "<init>",
                           "()V", false);

        // this.particle = particle;
        mv.visitVarInsn(ALOAD, local_this);
        mv.visitVarInsn(ALOAD, local_particle);
        mv.visitFieldInsn(PUTFIELD, implType.internalName(),
                          PARTICLE_FIELD_NAME, refs.particle_1_17.desc());

        // this.particleWrapper = new ParticleTypeImpl_X();
        writeParticleTypeAssignment(mv);

        mv.visitInsn(RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

}
