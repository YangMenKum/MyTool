package ioc.constructor;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author by yangkun
 * @date 2018/6/19 0019 下午 11:11
 * @Description
 */
public class IocMain {
    public static void main(String...args){
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("constructorbeans.xml");
            Person person =  ctx.getBean("chinese", Person.class);
            person.useAxe();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
