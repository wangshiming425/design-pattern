package com.itwsm.designPatternDemo.design_principle.Open_Closed;

public class DefaultSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
