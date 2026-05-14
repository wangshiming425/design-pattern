package com.itwsm.designPatternDemo.design_principle.dependency_inversion.cpu;

public class IntelCPU implements CPU {
    @Override
    public void run() {
        System.out.println("因特尔CPU运行");
    }
}
