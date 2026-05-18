package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Object;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "TFCard read msg: Hello TF";
    }

    @Override
    public void writeTF(String data) {
        System.out.println("TFCard write "+data);
    }
}
