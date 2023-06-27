package com.liumou2;

public class Text {
    public static void main(String[] args) {
        TutorFunction f = new TutorFunction("001","刘","员工");
        System.out.print(f.getId() + "," + f.getName() + f.getWork() );
        f.work();
    }
}
