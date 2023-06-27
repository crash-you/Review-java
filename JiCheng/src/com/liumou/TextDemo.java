package com.liumou;

public class TextDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("liumou01","撒到我",1000000000,2133333333);
        System.out.println(manager.getId() + "," + manager.getName() + ","
                + manager.getSalary() + "," + manager.getBonus());
    }
}
