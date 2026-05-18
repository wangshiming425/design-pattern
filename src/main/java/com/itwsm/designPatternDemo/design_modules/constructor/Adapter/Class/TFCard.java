package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Class;

//适配者类的接口
public interface TFCard {
    //从TF卡读取数据
    String readTf();
    //向TF卡写入数据
    void writeTF(String data);
}
