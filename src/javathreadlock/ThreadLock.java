package javathreadlock;

public class ThreadLock {
    //统计类锁加锁次数
    public static int i;
    //类对象
    public Object obj = new Object();
    //不加锁的代码块
    public void nolock(int thread){
        try{
            System.out.println("线程"+thread+"正在运行");
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    //方法锁
    public synchronized void lock1(int thread){
        try{
            System.out.println("方法锁一正在被线程"+thread+"运行");
            Thread.sleep(2000);
            System.out.println("方法所一被线程"+thread+"执行完了");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    //代码块锁1
    public void lock2(int thread){
        synchronized(this){
            try{
                System.out.println("代码块锁方法一正在被线程"+thread+"运行");
                Thread.sleep(2000);
                System.out.println("代码块锁方法一正在被线程"+thread+"执行完了");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    //代码块锁方法2
    public void lock3(int thread){
        synchronized(obj){
            try{
                System.out.println("代码块锁方法二正在被线程"+thread+"运行");
                Thread.sleep(2000);
                System.out.println("代码块锁方法二正在被线程"+thread+"执行完了");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    //类锁方法
    public synchronized static void lock4(int thread){
        try{
            System.out.println("类锁方法正在被线程"+thread+"运行");
            Thread.sleep(2000);
            System.out.println("类锁方法正在被线程"+thread+"执行完了");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //代码块锁3
    public void lock5(int thread){
        synchronized(this){
            try{
                System.out.println("代码块锁方法三正在被线程"+thread+"运行");
                Thread.sleep(2000);
                System.out.println("代码块锁方法三正在被线程"+thread+"执行完了");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
