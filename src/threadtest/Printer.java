package threadtest;

public class Printer implements Runnable {
    int id;
    static int num = 1;

    public Printer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        synchronized (Printer.class) {
            while (num <= 75) {
                if (num / 5 % 3 == id) {
                    System.out.print("id" + id + ":");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(num++ + ",");
                    }
                    System.out.println();
                    Printer.class.notifyAll();
                } else {
                    try {
                        Printer.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        new Thread(new Printer(0)).start();
        new Thread(new Printer(1)).start();
        new Thread(new Printer(2)).start();
    }
}
