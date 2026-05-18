package com.itwsm.designPatternDemo.design_modules.constructor.Adapter.Object;

public class Client{
    public static void main(String[] args) {
        Computer computer=new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
