package jvm.mt;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * @author by Young
 * @date 2019/3/23 0023
 * @Description MethodHandle demo
 */
public class MethodHandleDemo {
    class GrandFather{
        void thinking(){
            System.out.println("i am grandfather");
        }
    }
    class Father extends  GrandFather{
        @Override
        void thinking(){
            System.out.println("i am father");
        }
    }
    class Son extends Father{
        @Override
        void thinking(){
            // 需求是这里调用到grandfather.thinking()
            try{
                MethodType mt = MethodType.methodType(void.class);
                /*MethodHandle mh = lookup().findSpecial(GrandFather.class,"thinking",mt,getClass());
                mh.invoke(this);*/
                MethodHandle mh = lookup().findVirtual(GrandFather.class,"thinking",mt).bindTo(new GrandFather());
                mh.invokeExact();
            }catch (Throwable e){

            }
        }
    }
    public static void main(String[] args){
        (new MethodHandleDemo().new Son()).thinking();
    }
}
