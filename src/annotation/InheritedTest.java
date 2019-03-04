package annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 声明的此注解使用了Inherited元注解，表示此注解用在类上时，会被子类所继承
 * @author yangkun
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedTest {

    String value();
}
