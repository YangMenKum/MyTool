package forhuawei.interview;

/**
 *
 */
public class Qa1 {
    public static void changeStr(String str){
        str="welcome";
        System.out.printf("局部:%d\n",str.hashCode());
    }
    public static void main(String[] args) {
        String str="1234";
        System.out.printf("修改前:%d\n",str.hashCode());
        changeStr(str);
        System.out.printf("修改后:%d\n",str.hashCode());
        System.out.println(str);
    }
}
