package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Object;

public class SDAdapterTF implements SDCard{
    private TFCardImpl tfCardimpl=new TFCardImpl();
    @Override
    public String readSD() {
        System.out.println("适配器");
        return tfCardimpl.readTF();
    }

    @Override
    public void writeSD(String data) {
        tfCardimpl.writeTF(data);
    }
}
