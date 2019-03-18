package gc.reference;

import java.lang.ref.WeakReference;

/**
 * @date 2019/3/18 0018 下午 3:56
 * @Description 若引用使用方式
 */
public class WeakReferenceDemo {

    public static void main(String[] args){
        Car car = new Car();
        WeakReference<Car> weakCar = new WeakReference<Car>(car);
        // 当要获得weak reference引用的Obejct时
        // 首先需要判断它是否已经被回收
        // 如果get返回为null,则其指向的对象已经被回收
        if(weakCar.get()!=null){
            //TODO
            //do somthing
        }
    }
}
