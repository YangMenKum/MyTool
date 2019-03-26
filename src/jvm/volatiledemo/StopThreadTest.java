package jvm.volatiledemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by Young
 * @date 2019/3/25 0025
 * @Description
 */
class SimpleTask extends Thread {
    private int count = 0;
    private volatile boolean stop = false;

    public SimpleTask(String name) {
        this.setName(name);
    }

    public void stopThread() {
        Profiler.begin();
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("Thread " + count++);
        }
        System.out.println(Thread.currentThread().getName() + " quit ! 耗时：" + Profiler.end());
        ;
    }
}


public class StopThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        SimpleTask simpleTask = new SimpleTask("volatile变量验证线程");
        executor.execute(simpleTask);
        executor.shutdown();
        Thread.sleep(5000);
        simpleTask.stopThread();

    }
}