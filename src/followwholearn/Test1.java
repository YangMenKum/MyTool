package followwholearn;

/**
 * @date 2019/3/19
 * @Description 如果case内部没有break,
 * 那么将会无条件的继续向下执行其他case语句
 */
public class Test1 {
    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
    public static  void main(String[] args){
        //输出结果为10，因为 case2以及之后的语句都执行了
        System.out.println(getValue(2));
    }
}
