package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by yangkun
 * @date 2018/10/14 0014 上午 12:11
 * @Description
 */
public class NewDemo {
    // 输出查看
    static List<String> list1 = new ArrayList();
    static List<String> list2 = new ArrayList();
    static List<String> list3 = new ArrayList();
    static List<String> list4 = new ArrayList();
    static List<String> list5 = new ArrayList();
    static List<String> list6 = new ArrayList();
    // 存储结构
    static List<int[]> arraylist1 = new ArrayList(); // 第一行
    static List<int[]> arraylist2 = new ArrayList(); // 第二行
    static List<int[]> arraylist3 = new ArrayList(); // 第三行
    static List<int[]> arraylist4 = new ArrayList(); // 第一列
    static List<int[]> arraylist5 = new ArrayList(); // 第二列
    static List<int[]> arraylist6 = new ArrayList(); // 第三列

    public static void main(String[] args) {
        for (int a = 0; a <= 20; a++) {
            for (int b = 0; b <= 20; b++) {
                for (int c = 0; c <= 20; c++) {
                    int[] array = {a, b, c};
                    if (a + b - c == 4) {
                        if (c == 9 && a <= 4 && b >= 4) {
                            list1.add(a + "+" + b + "-" + c + "=4");
                            arraylist1.add(array);
                        }
                        if (a != 0 && a >= 4 && c <= 5) {
                            list3.add(a + "+" + b + "-" + c + "=4");
                            arraylist3.add(array);
                        }
                    }
                    if (a >= 4 && a - b * c == 4) {
                        if (c <= 5) {
                            list2.add(a + "-" + b + "*" + c + "=4");
                            list5.add(a + "-" + b + "*" + c + "=4");
                        } else {
                            list5.add(a + "-" + b + "*" + c + "=4");
                        }
                        arraylist2.add(array);
                        arraylist5.add(array);
                    }
                    if (c != 0 && (b % c != b) && a + b / c == 4) {
                        list4.add(a + "+" + b + "/" + c + "=4");
                        arraylist4.add(array);
                    }
                    if (a == 9 && a - b - c == 4) {
                        list6.add(a + "-" + b + "-" + c + "=4");
                        arraylist6.add(array);
                    }
                }
            }
        }

//        System.out.println(list1.size());
//        System.out.println(list2.size());
//        System.out.println(list3.size());
//        System.out.println(list4.size());
//        System.out.println(list5.size());
//        System.out.println(list6.size());
        for (int a = 0; a < arraylist1.size(); a++) {
            int var1[] = arraylist1.get(a);
            for (int b = 0; b < arraylist2.size(); b++) {
                int var2[] = arraylist2.get(b);
                for (int c = 0; c < arraylist3.size(); c++) {
                    int var3[] = arraylist3.get(c);
                    for (int d = 0; d < arraylist4.size(); d++) {
                        int var4[] = arraylist4.get(d);
                        if (var1[0] == var4[0] && var2[0] == var4[1] && var3[0] == var4[2]) {
                            for (int e = 0; e < arraylist5.size(); e++) {
                                int var5[] = arraylist5.get(e);
                                if (var1[1] == var5[0] && var2[1] == var5[1] && var3[1] == var5[2]) {
                                    for (int f = 0; f < arraylist6.size(); f++) {
                                        int var6[] = arraylist6.get(f);
                                        if (var1[2] == var6[0] && var2[2] == var6[1] && var3[2] == var6[2]) {
                                            System.out.println("**********************");
                                            System.out.println(var1[0] + "+" + var1[1] + "-" + "9=4");
                                            System.out.println("+  -  -");
                                            System.out.println(var2[0] + "-" + var2[1] + "*" + var2[2] + "=4");
                                            System.out.println("/  *  -");
                                            System.out.println(var3[0] + "+" + var3[1] + "-" + var3[2] + "=4");
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
