package aopproxy.cglib;

import aopproxy.jdk.ProxyTarget;

/**
 * @author by yangkun
 * @date 2019/3/4 0004 下午 11:07
 * @Description
 */
public class ProxyObject {
    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        ProxyTarget proxyTarget = (ProxyTarget)cglibProxy.getProxy(ProxyTarget.class);
        proxyTarget.targetMethod();
    }
}
