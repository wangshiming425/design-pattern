package com.itwsm.designPatternDemo.design_principle.Interface_Segregation;

public class MyDoor implements Safeproof,Watterproof{
    @Override
    public void safeproof() {
        System.out.println("防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("放水");
    }
}
