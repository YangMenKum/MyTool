package followwholearn;

/**
 * @author by Young
 * @date 2019/3/19 0019
 * @Description 升序数组合并
 */
public class Test4 {
    public static int[] merge(int[] a1,int[] a2){
        int len1 =a1.length;
        int len2 = a2.length;
        int result[] = new int[len1+len2];
        int index1=0,index2=0,index3=0;
        while(index1<len1&& index2<len2){
            if(a1[index1]<a2[index2]){
                result[index3++]=a1[index1++];
            }else{
                result[index3++]=a2[index2++];
            }
        }
        while(index1<len1){
            result[index3++]=a1[index1++];
        }
        while(index2<len2){
            result[index3++]=a2[index2++];
        }
        return result;
    }
    public static void main(String[] args){
        int[] a1 = new int[]{1,4,5,7,9};
        int[] a2 = new int[]{2,3,6,8};
        int[] result;
        result=merge(a1,a2);
        for (int a:result) {
            System.out.print(a);
        }
    }
}
