package equalstest;

public class Demo {
    Integer a = new Integer(12);
    Integer b = new Integer(12);
    Integer c = new Integer("12");
    Integer d = new Integer("12");
    String stra = new String("abc");
    String strb = new String("abc");
    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.println(demo.a==demo.b);
        System.out.println(demo.c==demo.d);
        System.out.println(demo.stra==demo.strb);

        String s1 = "ab";
        String s2 = "a"+"b";
        String s3 = "a";
        String s4 = "b";
        String s5 = s3+s4;
        System.out.println(s1==s2);
        System.out.println(s2==s5);
    }
}
