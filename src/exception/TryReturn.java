package exception;

/**
 * @author by yangkun
 * @date 2018/7/2 0002 下午 9:57
 * @Description
 */
public class TryReturn {
    int a = 0;
    public static void main(String... args) {
        TryReturn tryReturn = new TryReturn();
        System.out.println(tryReturn.myMethod());
        System.out.println(tryReturn.a);
    }

    public  int myMethod() {
        try {
            System.out.println("try!");
            a = 1;
            return a;

        } catch (Exception e) {
            System.out.println("catch!");
            a = 2;
            //return a;
        } finally {
            a = 3;
            System.out.println("finally!");
            // return a;
        }
        return a;
    }
}
