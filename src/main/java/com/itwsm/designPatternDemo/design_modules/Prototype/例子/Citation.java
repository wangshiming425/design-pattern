package com.itwsm.designPatternDemo.design_modules.Prototype.例子;

public class Citation implements Cloneable {
    //获奖人
    private String name;
    private Integer id;

    public Citation(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Citation{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Citation(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        System.out.println("克隆出一个奖状");
        return (Citation) super.clone();
    }
}
