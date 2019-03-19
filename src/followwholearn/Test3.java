package followwholearn;

/**
 * @date 2019/3/19
 * @Description
 */
public class Test3 {
    public static void  main(String[] args){
        Thread t = new Thread(){
            @Override
            public void run(){
                pong();
            }
        };
        // 该行代码相当于启动线程，start里边会去调用run,并且不等待返回结果，跟主线程并行
        // t.start();
        // 该行代码相当于直接调用了t对象的run方法，还是在main线程当中执行的。代码顺序执行
        t.run();
        System.out.print("ping");
    }
    static void  pong(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("pong");
    }
}
