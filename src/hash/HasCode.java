package hash;

public class HasCode {
    public static void main(String...args){
        int hashcode = "abc".hashCode();
        int hash = hashcode^hashcode >>> 16;
        int tabi = (12-1)&hash;
        System.out.printf("hashcode:%d\nhash:%d\ntabi:%d\n",hashcode,hash,tabi);
    }
}
