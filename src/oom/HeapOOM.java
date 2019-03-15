package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by yangkun
 * @date 2019/3/15 0015 下午 7:59
 * @Description 模拟堆内存溢出
 * VM args: -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class OOMObject{
    }
    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
