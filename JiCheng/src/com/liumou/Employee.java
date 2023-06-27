package com.liumou;

public class Employee extends Equals{

    public Employee() {
    }


    public Employee(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void Work() {
        System.out.println("炒菜");
    }

    @Override
    public void Eat() {

        System.out.println("吃米饭");
    }
}
