package com.itwsm.designPatternDemo.design_principle.Liskov_Substitution.after;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(20,15);
        resize(r);
        System.out.println("=================");
        printLegthAndWidth(new Square(10));
    }

    //扩宽
    public static void resize(Rectangle rectangle){
         while (rectangle.getWidth()<= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
        printLegthAndWidth(rectangle);
    }

    //打印长和宽
    public static void printLegthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
