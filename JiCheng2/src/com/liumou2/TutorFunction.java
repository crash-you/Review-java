package com.liumou2;

public class TutorFunction extends ScienceWorker{

    public TutorFunction() {
    }

    public TutorFunction(String id, String name, String work) {
        super(id, name, work);
    }

    public void work()
    {
        System.out.println("讲课");
    }

}
