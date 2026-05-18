package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Class;

//目标创建一个设配器类,让电脑也可以读取TF卡内容
public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        SDCard card=new SDCardImpl();
        String s = computer.readSD(card);
        System.out.println(s);

        //使用适配器去读取TF卡内容
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
