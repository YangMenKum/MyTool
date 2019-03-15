package oom;

/**
 * @date 2019/3/15 0015 下午 11:11
 * @Description StackOverflowError
 * JVM args: -Xss2M
 */
public class JavaVMStackSOF {
    private int stackLength=-1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom= new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("Stack length:" +oom.stackLength);
            throw e;
        }
    }
}
