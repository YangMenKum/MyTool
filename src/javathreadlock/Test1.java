package javathreadlock;

class Test1 extends Thread{

    public ThreadLock lock;
    public int i;

    public Test1(ThreadLock lock,int i){
        this.lock=lock;
        this.i=i;
    }

    public void run(){
        lock.nolock(i);
        lock.lock5(i);
        //ThreadLock.lock4(i);
    }
}