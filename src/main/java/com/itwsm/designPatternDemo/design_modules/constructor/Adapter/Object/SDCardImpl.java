package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Object;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SDCard read msg: Hello SD";
    }

    @Override
    public void writeSD(String data) {
        System.out.println("SDCard write "+data);
    }
}
