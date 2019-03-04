package threadtest;

/**
 * @author by yangkun
 * @date 2018/6/15 0015 下午 12:28
 * @Description
 */

public class ObjectSynchronized {
    public synchronized void methodA(){
        try {
            Thread.sleep(1000);
            System.out.println("methodA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void methodB(){
        System.out.println("methodB");
    }
    public static void main(String...args){
        ObjectSynchronized object = new ObjectSynchronized();
        object.methodA();
        object.methodB();
    }
}
