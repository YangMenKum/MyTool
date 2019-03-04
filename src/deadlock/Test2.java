package deadlock;

public class Test2  extends Thread{
    ThreadLock lock;
    int i;
    public Test2(ThreadLock lock,int i){
        this.lock=lock;
        this.i=i;
    }
    public void run(){
        try{

            lock.fun2(i);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}