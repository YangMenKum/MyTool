package deadlock;

public class Test1 extends Thread{

    ThreadLock lock;
    int i;
    public Test1(ThreadLock lock,int i){
        this.lock=lock;
        this.i=i;
    }

    public void run(){
        try{
            lock.fun1(i);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}