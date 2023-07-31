package com.liumou.GaoJiLiu.SortStream;

import java.io.Serializable;

/*
*
* 接口里没有抽象方法，叫做标记型接口
* 一旦实现了接口，表示当前的类可以被序列化
*
* */
public class Student implements Serializable {
    private String name;
    private int  age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
