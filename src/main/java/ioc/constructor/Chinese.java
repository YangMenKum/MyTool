package ioc.constructor;

/**
 * @author by yangkun
 * @date 2018/6/19 0019 下午 11:38
 * @Description
 */
public class Chinese implements Person {
    private Axe axe;
    @Override
    public  void useAxe(){
        System.out.println(axe.chop());
    }
    public  Chinese(Axe axe) {
        this.axe = axe;
    }
}
