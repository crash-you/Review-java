package com.liumou;

public class MethodIntroduce {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "异常分类：" +
                        "老祖宗接口：Throwable" +
                        "error异常 、 exception异常" +
                        "error异常代表系统级别的错误，属于严重问题，是给sun公司用的，不是给我们程序员用的" +
                        "exception异常：代表程序可能出现的问题，通常用exception以及他的子类来封装程序出现的问题" +
                        "exception异常：\n" +
                                "运行时异常：运行时出现的异常，如数组越界异常" +
                                "除运行时异常以外的异常，会在编译阶段提醒" );
        System.out.println("" +
                "异常的作用：" +
                    "查看bug的关键参考信息" +
                    "可作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况");

        System.out.println("" +
                "jvm默认处理异常方式" +
                    "1、把异常的名称、原因及异常出现的位置输出在控制台中" +
                    "2、程序停止执行，异常下面的代码终止执行" );
        System.out.println("捕获异常：" + "->\n");
        System.out.println("格式：try{" +
                "可能出现异常的代码;" +
                "}catch（异常类名 变量名）" +
                "{" +
                "异常的处理代码" +
                "}");
        System.out.println("好处，可以让程序继续执行下面代码不会被终止");
        System.out.println("=============================================");
        int arr[] = {1,2,3,4,5};

        System.out.println("" +
                "如果try中没有遇到问题，怎么执行?\n" +
                "如果try中可能会遇到多个问题，怎么执行?\n" +
                "写多个异常与之对应，如果有父子关系，父类要写在下边"+
                "如果try中遇到的问题没有被捕获，怎么执行?\n" +
                "如果try中遇到了问题，那么try下面的其他代码还会执行吗?");

        System.out.println("第一问：");
        try {
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println("看看我执行了吗？");

        System.out.println("====================================");

        System.out.println("第二问：");
        try {
            System.out.println(arr[10]);
            System.out.println(10/0);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println("看看我执行了吗");

        System.out.println("===================================");

        System.out.println("第三问：");
        try {
            System.out.println(10/0);
        }catch (ArrayIndexOutOfBoundsException e)
        {
           /* e.getMessage();*/
            /*e.toString();*/
            /*e.printStackTrace();*/
            System.out.println("索引越界");
        }catch (ArithmeticException arithmeticException){
/*
            System.out.println(arithmeticException.toString());
*/
            System.out.println("算数异常");
        }

        System.out.println("看看我执行了吗");



        /*
        异常中的常见方法
            public string getMessage()  返回此throwable的详细消息字符串
            public string toString()    返回此可抛出的简短描述
            public void printStackTrace()   把异常的错误信息输出在控制台
                                             是以System.err.println进行输出，把异常的错误信息以红色字体打印在控制台中

         */

        /*
        异常的抛出处理
        throws
        注意:写在方法定义处，表示声明一个异常
            告诉调用者，使用本方法可能会有哪些异常

        throw
        写在方法内，结束方法，手动抛出异常对象，交给调用者方法中下面的代码不再执行了
         */

    }
}
