package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Class;

public class TFCardImpl implements TFCard {
    @Override
    public String readTf() {
        return "TFCard read msg: Hello World";
    }

    @Override
    public void writeTF(String data) {
        System.out.println("TFCard Write: " + data);
    }
}
