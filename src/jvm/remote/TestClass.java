package jvm.remote;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author by Young
 * @date 2019/3/23 0023
 * @Description 本地测试用例
 */
public class TestClass {
    public static  void main(String[] args) throws IOException, NoSuchMethodException {
        InputStream inputStream=new FileInputStream("DemoClass.class的绝对路径");
        byte[] b=new byte[inputStream.available()];
        inputStream.read(b);
        inputStream.close();
        System.out.println(JavaClassExecuter.executer(b));
    }
}
