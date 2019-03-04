package nowcoder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * @author by yangkun
 * @date 2018/7/2 0002 下午 7:22
 * @Description
 */
class Parent{
    Parent() {
        System.out.println("调用父类构造方法!");
    }
    private static void staticParent() {
        System.out.println("调用父类静态方法");
    }
    private final  void finalParent() {
        System.out.println("调用父类final方法");
    }
    private void printParent(){
        System.out.println("调用父类私有方法");
    }
}
class Child extends Parent {
    public void printChild(){
        System.out.println("调用子类公有方法");
    }
}
public class inherit {
    public static void main(String[] args) throws Exception {
        //获取子类
        Class clazz = Class.forName("nowcoder.Child");
        //得到父类
        Class superClass = clazz.getSuperclass();
        //得到父类非继承的所以方法
        Method[] methods = superClass.getDeclaredMethods();
        //设置私有方法可以被访问
        AccessibleObject.setAccessible(methods,true);
        for (Method m:methods) {
            System.out.println();
            System.out.println("子类调用方法"+m.getName()+"()的调用结果:" );
            m.invoke(new Child());
        }
    }
}
