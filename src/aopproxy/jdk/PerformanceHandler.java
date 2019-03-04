package aopproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author by yangkun
 * @date 2019/3/4 0004 下午 10:24
 * @Description AOP增强效果类
 */
public class PerformanceHandler implements InvocationHandler {
    private Object target;

    public PerformanceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object obj = method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        System.out.printf("%s 用时 %d mills\n", method.getName(), (endTime - beginTime));
        return obj;
    }
}
