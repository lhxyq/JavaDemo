package com.lh.demo.hash;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * Created by LH 2446059046@qq.com on 2017/9/11.
 */
public class HashCodeTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println("agent 可以实现对jvm性能的监控，优化和控制！");
        return new byte[0];
    }
}
