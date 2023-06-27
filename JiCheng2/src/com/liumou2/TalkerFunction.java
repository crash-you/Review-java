package com.liumou2;

public class TalkerFunction extends ScienceWorker{
    private String talker;

    public TalkerFunction() {
    }

    public TalkerFunction(String id, String name, String work, String talker) {
        super(id, name, work);
        this.talker = talker;
    }

    public String getTalker() {
        return talker;
    }

    public void setTalker(String talker) {
        this.talker = talker;
    }

    public void work(){
        System.out.println("备案");
    }
}
