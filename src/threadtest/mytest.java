package threadtest;

public class mytest implements Runnable{
    private int id;
    public static int num = 1;
    public mytest(int id){
        this.id = id;
    }
    @Override
    public void run() {
        synchronized (mytest.class){
            while(num <= 75){
                if(num /5 % 3 == id){
                    System.out.printf("pid%d:",id);
                    for(int i=0;i<5;i++){
                        System.out.print(num + ",");
                        num++;
                    }
                    System.out.println();
                    mytest.class.notifyAll();
                }else{
                    try {
                        mytest.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String...args){
        new Thread(new mytest(0)).start();
        new Thread(new mytest(1)).start();
        new Thread(new mytest(2)).start();
    }
}
