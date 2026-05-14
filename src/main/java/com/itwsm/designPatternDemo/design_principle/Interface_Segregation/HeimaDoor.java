package com.itwsm.designPatternDemo.design_principle.Interface_Segregation;

public class HeimaDoor implements Fireproof,Watterproof,Safeproof{
    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void safeproof() {
        System.out.println("防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
