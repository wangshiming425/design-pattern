package com.itwsm.designPatternDemo.design_modules.creator.bulider.demo1;

public class Client {
    public static void main(String[] args) {
        Direactor direactor=new Direactor(new ModenBulider());
        Bike construct = direactor.construct();
        System.out.println(construct);
    }
}
