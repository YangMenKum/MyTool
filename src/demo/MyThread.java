package demo;

/**
 * @author by yangkun
 * @date 2018/7/2 0002 下午 9:38
 * @Description
 */
public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread s = new MyThread();
        t.start();
        System.out.println("one.");
        s.start();
        System.out.println("two.");
    }

    @Override
    public void run() {
        System.out.println("Thread");
    }
}
