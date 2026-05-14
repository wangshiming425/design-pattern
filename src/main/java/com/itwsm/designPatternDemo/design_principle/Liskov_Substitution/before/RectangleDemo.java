package com.itwsm.designPatternDemo.design_principle.Liskov_Substitution.before;

public class RectangleDemo {
    public static void main(String[] args) {
        //创建一个矩形对象
        Rectangle r=new Rectangle(15,13);
        resize(r);
        //举一个正方形反例
        //此时基类可以使用而子类不能,违背了里氏代换原则
        System.out.println("==================");
        Rectangle s=new Square();
        s.setWidth(15);
        resize(s);
    }
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth()<= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
        printLengthAndWidth(rectangle);
    }

    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println("Length="+rectangle.getLength());
        System.out.println("Width="+rectangle.getWidth());
    }
}
