package javathreadlock;

public class JavaThreadlock {

    public static void main(String[] args) {
        // TODO code application logic here

        //两个测试类的实例对象
        ThreadLock lock = new ThreadLock();
        ThreadLock lock2 = new ThreadLock();

        //同一个对象的两个线程
        Test1 t1 = new Test1(lock,1);
        Test2 t2 = new Test2(lock,2);

        t1.start();
        t2.start();
        //通过测试结果可以看出，t1,t2线程不能同时执行被synchronized标记的代码块或者方法。

        //不同对象的不同线程
        Test3 t3 = new Test3(lock2,3);
        Test4 t4 = new Test4(lock,4);
        t3.start();
        t4.start();
        //通过测试结果可以看出，不同对象的不同线程，执行被synchronized标记的代码块或者方法不受影响，
        //而执行被synchronized标记的静态函数，则受到限制
    }
}
