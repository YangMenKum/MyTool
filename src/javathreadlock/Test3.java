package javathreadlock;

class Test3 extends Thread{

    public ThreadLock lock;
    public int i;

    public Test3(ThreadLock lock,int i){
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