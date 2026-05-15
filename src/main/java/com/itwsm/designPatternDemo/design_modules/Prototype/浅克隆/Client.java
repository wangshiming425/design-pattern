package com.itwsm.designPatternDemo.design_modules.Prototype.浅克隆;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        //调用clone方法克隆
        Realizetype clone = realizetype.clone();
        System.out.println(clone==realizetype);
    }

}
