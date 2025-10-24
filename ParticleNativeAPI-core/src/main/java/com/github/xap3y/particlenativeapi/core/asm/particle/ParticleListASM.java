package com.github.xap3y.particlenativeapi.core.asm.particle;

import com.github.xap3y.particlenativeapi.core.asm.ContextASM;
import com.github.xap3y.particlenativeapi.core.asm.skeleton.ClassSkeleton;
import com.github.xap3y.particlenativeapi.core.asm.skeleton.ClassSkeletonASM;
import com.github.xap3y.particlenativeapi.core.asm.particle.type.ParticleTypesProvider;
import com.github.xap3y.particlenativeapi.core.asm.utils.SpigotParticleVersion;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

public class ParticleListASM extends ClassSkeletonASM {

    private final SpigotParticleVersion particleVersion;
    private final ParticleTypesProvider particleTypesProvider;

    private final ClassSkeleton skeleton;

    public ParticleListASM(ContextASM context,
                           SpigotParticleVersion particleVersion,
                           ClassSkeleton skeleton) {
        super(context, skeleton);
        this.particleVersion = particleVersion;
        this.skeleton = skeleton;
        this.particleTypesProvider = context.particleTypesProvider;
    }

    @Override
    public void writeFields(ClassWriter cw) {

    }

    @Override
    public void writeConstructors(ClassWriter cw) {
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC,
                "<init>", "(" + refs.particleNativeAPI.desc() +  ")V", null, null);
        mv.visitCode();

        int local_this = 0;
        int local_api = 1;

        mv.visitVarInsn(ALOAD, local_this);
        mv.visitVarInsn(ALOAD, local_api);
        mv.visitMethodInsn(INVOKESPECIAL,
                superType.internalName(),
                "<init>",
                "(" + refs.particleNativeAPI.desc() + ")V", false);

        mv.visitInsn(RETURN);

        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    @Override
    public void writeMethods(ClassWriter cw) {
        particleTypesProvider.generateParticleFactoryMethods(cw, particleVersion, skeleton);
    }

}
