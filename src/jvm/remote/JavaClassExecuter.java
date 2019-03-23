package jvm.remote;

import java.lang.reflect.Method;

/**
 * @author by Young
 * @date 2019/3/23 0023
 * @Description
 */


/**
 * 执行类，通过反射调用测试类中的main方法，最后取出HackSystem中字节数组流中的数据进行返回
 */
public class JavaClassExecuter {
    public static String executer(byte[] classByte) throws NoSuchMethodException {
        HackSystem.clearBuffer();
        ClassModifier classModifier = new ClassModifier(classByte);
        byte[] modiByte = classModifier.modifyUTF8Constant("java/lang/System", "jvm/remote/HackSystem");
        HotSwapClassLoader loader = new HotSwapClassLoader();
        Class cs = loader.loadByte(modiByte);
        try {
            Method method = cs.getMethod("main", new Class[]{String[].class});
            method.invoke(null, new String[]{null});
        } catch (Throwable throwable) {
            throwable.printStackTrace(HackSystem.out);
        }
        return HackSystem.getBufferString();
    }
}