package followwholearn;

/**
 * @date 2019/3/19
 * @Description
 */
public class Test2 {
    public static void swap(String a, String b) {
        String t = a;
        a = b;
        b = t;
    }
    public static void main(String[] args){
        String a="a";
        String b="b";
        swap(a,b);
        System.out.println(a+","+b);
    }
}
