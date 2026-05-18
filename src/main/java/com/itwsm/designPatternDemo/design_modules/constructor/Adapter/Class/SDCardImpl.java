package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Class;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SDCard read msg: Hello World";
    }

    @Override
    public void writeSD(String data) {
        System.out.println("SDCard Write data: "+data);
    }
}
