package MethodCite1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class introduce {
    public static void main(String[] args) {
        System.out.println(
                "把以前学的方法 调过来用\n" +
                        "1" + "引用处必须是函数式接口" +
                        " 被引用的方法必须存在  \n" +
                        " 被引用的方法的形参和返回值需要跟抽象方法保持一致\n" +
                        " 被引用的方法的功能要满足当前需求\n"
        );

        //静态方法里不能有this和super，如果要引用，需要新创建对象
        System.out.println(
                "引用成员方法\n" +
                        "格式：\n" +
                        "其他类：其他类对象::方法名\n" +
                        "本类：this::方法名\n" +
                        "父类：super::方法名\n" +
                        "引用构造方法\n" +
                        "格式：类名::new\n" +


                "方法引用的规则:\n" +
                        "1.需要有函数式接口\n" +
                        "2.被引用的方法必须已经存在\n" +
                        "3.被引用方法的形参，需要跟抽象方接的第二个形参到最后一个形参保持一致，返回值需要保持一致。4.被引用方法的功能需要满足当前的需求\n" +
               "抽象方法形参的详解:\n" +
                        "第一个参数:表示被引用方法的调用者，决定了可以引用哪些类中的方法\n" +
                        "在Stream流当中，第一个参数一般都表示流里面的每一个数据。\n" +
                        "假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用string这个类中的方法\n" +
                        "第二个参数到最后一个参数:跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法需要是无参的成员方法\n" +
                        "");


        System.out.println("eg:");
        System.out.println("=======================================");

        //创建一个数组进行倒叙排序
        Integer[] arr = {1, 4, 6, 3, 8, 5};

        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        System.out.println(Arrays.toString(arr));*/
        /*System.out.println("====================================");

        lambda表达式：
        Arrays.sort(arr,(Integer integer, Integer t1)->{
            return t1 - integer;
                });
        System.out.println(Arrays.toString(arr));*/

//lambda表达式简化版本
//        Arrays.sort(arr,(integer, t1)-> t1 - integer);

        //方法引用
        Arrays.sort(arr, introduce::subtraction);//::为方法引用符

    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }

}
