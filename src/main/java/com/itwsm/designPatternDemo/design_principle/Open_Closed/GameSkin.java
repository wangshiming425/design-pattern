package com.itwsm.designPatternDemo.design_principle.Open_Closed;

public class GameSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("游戏皮肤");
    }
}
