package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Class;

public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("使用了适配器");
        return readTf();
    }

    @Override
    public void writeSD(String data){
        System.out.println("使用了适配器");
        writeTF(data);
    }
}
