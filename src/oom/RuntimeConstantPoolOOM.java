package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2019/3/15 0015 下午 8:39
 * @Description 运行时常量池导致内存溢出
 * VM args: -XX:PermSize=10M -XX:MaxPermSize=10M(jdk1.6以及之前版本有效)
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
            System.out.println(i);
        }
    }
}
