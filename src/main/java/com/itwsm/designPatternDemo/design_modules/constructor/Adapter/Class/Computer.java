package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Class;

//计算机类只能调用SD卡接口
public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
