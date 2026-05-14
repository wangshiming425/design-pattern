package com.itwsm.designPatternDemo.design_principle.Law_of_Demeter;

//粉丝类
public class Fans {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fans(String name) {
        this.name = name;
    }

    public Fans() {
    }
}
