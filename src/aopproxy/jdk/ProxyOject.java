package aopproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author by yangkun
 * @date 2019/3/4 0004 下午 10:37
 * @Description AOP代理类
 */
public class ProxyOject {

    public static void main(String[] args) {
        ProxyTarget proxyTarget = new ProxyTarget();
        PerformanceHandler handler = new PerformanceHandler(proxyTarget);
        IProxyTarget iProxyTarget = (IProxyTarget) Proxy.newProxyInstance(
                proxyTarget.getClass().getClassLoader(),
                proxyTarget.getClass().getInterfaces(),
                handler);
        iProxyTarget.targetMethod();
    }

}
