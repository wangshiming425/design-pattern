package com.itwsm.designPatternDemo.design_principle.Liskov_Substitution.after;

//没有继承长方形类,二者不是父子类关系,就没有里氏代换原则失效发生
public class Square implements Quadrilateral{
    private double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
