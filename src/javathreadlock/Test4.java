package javathreadlock;

class Test4 extends Thread{

    public ThreadLock lock;
    public int i;

    public Test4(ThreadLock lock,int i){
        this.lock=lock;
        this.i=i;
    }

    public void run(){
        lock.nolock(i);
        //lock.lock1(i);
        //lock.lock2(i);
        lock.lock5(i);
        ThreadLock.lock4(i);
    }

}