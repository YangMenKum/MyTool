package forhuawei.interview;

/**
 * 类继承测试
 * 方法重载：方法的可见度不能降低
 * 注意：方法重载与返回值类型和修饰符无关
 */
public class Qa2 {

}
class Father{
    protected int method(int a){return 0;}
}
class Son extends Father{
    @Override
    public int method(int a){
    //override（重写，覆盖）
    //
    //1、方法名、参数、返回值相同。
    //
    //​2、子类方法不能缩小父类方法的访问权限。
    //
    //3、子类方法不能抛出比父类方法更多的异常(但子类方法可以不抛出异常)。
    //
    //4、存在于父类和子类之间。
    //
    //​5、方法被定义为final不能被重写。
        return 0;
    }

    private int methodA(){
        return 0;
    }
    private int methodA(int param){
    // overload（重载，过载）
    // 1、参数类型、个数、顺序至少有一个不相同。
    //​ 2、不能重载只有返回值不同的方法名。
    // 3、存在于父类和子类、同类中。
        return 0;
    }
}