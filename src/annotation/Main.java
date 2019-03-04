package annotation;

import java.lang.annotation.Annotation;

/**
 * @author by yangkun
 * @date 2018/6/16 0016 下午 11:44
 * @Description
 */
public class Main {
    public static  void main(String...args){
        Class<?> classTest= null;
        try {
            classTest = Class.forName("annotation.AnnotationTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Annotation[] ann=classTest.getAnnotations();
        for(Annotation aa:ann){
            User u=(User)aa;
            System.out.println(u.name());
        }
    }
}
