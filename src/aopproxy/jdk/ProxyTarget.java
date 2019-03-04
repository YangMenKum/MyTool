package aopproxy.jdk;

/**
 * @author by yangkun
 * @date 2019/3/4 0004 下午 10:20
 * @Description 被代理类
 */
public class ProxyTarget  implements  IProxyTarget{
    @Override
    public void targetMethod(){
        System.out.println("ProxyTarget.targetMethod used");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
