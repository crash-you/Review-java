package com.liu.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        /*
            定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
            过滤奇数，只留下偶数。
            并将结果保存起来
        */
        ArrayList<Integer> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = arrayList.stream()
                .filter(s -> s % 2 == 0)
                //.forEach(s -> System.out.println(s));
                .collect(Collectors.toList());
          System.out.println(collect);
    }


}
