package com.itwsm.designPatternDemo.design_principle.Law_of_Demeter;

//明星类
public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public Star() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
