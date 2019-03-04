package forhuawei.interview;

/**
 * 内部类实例化
 */
public class Qa3 {
    class InnerClass{
        public InnerClass(){
            System.out.println("instance InnerClass");
            System.out.println(this.getClass().getName());
        }
    }
    public void getInnerClass(){
        new InnerClass();
    }
    public static void  main(String...args){
        Qa3 outClass = new Qa3();
        Qa3.InnerClass innerClass = outClass.new InnerClass();
    }
}
