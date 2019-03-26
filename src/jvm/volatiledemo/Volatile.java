package jvm.volatiledemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author by Young
 * @date 2019/3/26 0026
 * @Description
 */
public class Volatile implements Runnable {

    private static volatile boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println(Thread.currentThread().getName() + " 正在运行。。。");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void stopThread() {
        flag = false;
        System.out.println("---------------------stopThread------------------------");
        Profiler.begin();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2000, 2000, 1, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1));
        for (int i = 0; i < 2000; i++) {
            Volatile aVolatile = new Volatile();
            pool.execute(aVolatile);
        }
        pool.shutdown();
        System.out.println("main 线程正在运行");
        //Thread.sleep(5000);
        stopThread();

    }

}