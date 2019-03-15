package oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Description 直接内存溢出
 * JVM args: -XX:MaxDirectMemorySize=10M
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafefield = Unsafe.class.getDeclaredFields()[0];
        unsafefield.setAccessible(true);
        // 返回指定对象上由此Field表示的字段的值。
        // 如果该对象具有原始类型，则该值将自动包装在对象中。
        Unsafe unsafe = (Unsafe) unsafefield.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
