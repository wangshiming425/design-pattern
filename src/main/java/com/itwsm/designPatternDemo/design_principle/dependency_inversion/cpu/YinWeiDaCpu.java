package com.itwsm.designPatternDemo.design_principle.dependency_inversion.cpu;

public class YinWeiDaCpu implements CPU{
    @Override
    public void run() {
        System.out.println("英伟达CPU开始运行");
    }
}
