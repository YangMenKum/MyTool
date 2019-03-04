package deadlock;

public class ThreadLock extends Thread{
    private Object obj=new Object();

    /**
     *普通方法锁
     * @param i
     */
    public synchronized void fun1(int i){
        try{
            System.out.println("我在使用函数1，我是线程"+i);
            Thread.sleep(2000);     // 等待线程2的启动
            System.out.println("我使用完了，我要是使用函数2我是线程"+i);
            fun2(i);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    // 对象锁
    public  void fun2(int i){
        synchronized(obj){
            try{
                System.out.println("我在使用函数2，我是线程"+i);
                Thread.sleep(2000);
                System.out.println("我使用完了，我要使用函数1我是线程"+i);
                fun1(i);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
