package interceptor;

/**
 * @author by yangkun
 * @date 2018/6/18 0018 下午 5:42
 * @Description
 */
public class BusinessClass implements BusinessFacade{
    @Override
    public void doSomething(){
        System.out.println("在业务组件 BusinessClass 中调用方法: doSomething()");
    }
    @Override
    public void redoSomething(){
        System.out.println("在业务组件 BusinessClass 中调用方法: reSomething()");
    };
}
