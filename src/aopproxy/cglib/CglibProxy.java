package aopproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author by yangkun
 * @date 2019/3/4 0004 下午 11:01
 * @Description cglib实现AOP
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object obj = methodProxy.invokeSuper(o, objects);
        long endTime = System.currentTimeMillis();
        System.out.printf("%s 用时 %d mills\n", method.getName(), (endTime - beginTime));
        return obj;
    }
}
