package deadlock;

public class Javadeadlock {
    public static void main(String[] args) {

        // TODO code application logic here
        ThreadLock lock=new ThreadLock();
        Test1 t1=new Test1(lock,1);
        Test2 t2=new Test2(lock,2);
        t1.start();
        t2.start();
    }
}
