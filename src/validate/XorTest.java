package validate;

/**
 * 异或验证
 * 位移验证
 */
public class XorTest {
    public static void main(String...args){
        String key = "key";
        int h;
        // >>> 无符号右移 空位0补齐
        int result = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        int left = key.hashCode();
        int right = left>>>16;
        int xor = left^right;
        System.out.println(left);
        System.out.println(right);
        System.out.println(xor);
        System.out.println(result);
    }
}
