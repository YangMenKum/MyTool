package interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author by yangkun
 * @date 2018/6/18 0018 下午 5:45
 * @Description 动态代理处理器工具
 */
public class DynamicProxyHandler implements InvocationHandler {
    // 声明被代理对象
    private Object business;

    // 创建拦截器
    private InterceptorClass interceptor = new InterceptorClass();

    /**
 　　* 代理需要调用的方法，并在该方法调用前后，先调用连接器的方法。
 　　*
 　　* @param proxy 代理类对象
 　　* @param method 被代理的接口方法
 　　* @param args 被代理接口方法的参数
 　　* @return 方法调用返回的结果
 　　* @throws Throwable
 　　*/
    public Object bind(Object business) {
        this.business = business;
        return Proxy.newProxyInstance(business.getClass().getClassLoader(),
                business.getClass().getInterfaces(),
                this);
    }
    /**
 　　* 代理需要调用的方法，并在该方法调用前后，先调用连接器的方法。
 　　*
 　　* @param proxy 代理类对象
 　　* @param method 被代理的接口方法
 　　* @param args 被代理接口方法的参数
 　　* @return 方法调用返回的结果
 　　* @throws Throwable
 　　*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        interceptor.before();
        // 只要是调用了business中的方法，就会触发这个代理
        result = method.invoke(business, args);
        interceptor.after();
        return null;
    }
}
