package demo;

class A {
    protected int value;

    public A(int v) {
        setValue(v);
    }

    public void setValue(int value) {
        //System.out.println("setValue A" + value);
        this.value = value;
    }

    public int getValue() {
        try {
            value++;
            return value;
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            this.setValue(value);
            System.out.println(value);
        }
        return value;
    }
}

class B extends A {
    public B() {
        super(5);
        setValue(getValue() - 3);
    }

    @Override
    public void setValue(int value) {
        //System.out.println("setValue B" + value);
        super.setValue(2 * value);
    }
}
public class DemoTest {
    static String value = "";
    static void staticmethod(){
        System.out.println("staticmethod!");;
    }
    void ordinaryMethod(){
        System.out.println(value);
        staticmethod();
    }
    public static void main(String[] args) {
        //System.out.println(new B().getValue());
//        new DemoTest().ordinaryMethod();
//        Integer interger = 0;
//        System.out.println(interger+"");
        int a = Integer.MAX_VALUE;
        System.out.println(a+1);
    }
}
