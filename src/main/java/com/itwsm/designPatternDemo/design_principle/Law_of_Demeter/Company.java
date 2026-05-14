package com.itwsm.designPatternDemo.design_principle.Law_of_Demeter;
//公司类
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }
}
