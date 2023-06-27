package com.liumou;

public class Manager extends Equals{

    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, int salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void Work() {
        System.out.println("管理奖金");
    }

    @Override
    public void Eat() {
        System.out.println("吃米饭");
    }
}
