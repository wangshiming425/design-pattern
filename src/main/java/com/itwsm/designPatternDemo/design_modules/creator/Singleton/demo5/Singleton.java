package com.itwsm.designPatternDemo.design_modules.creator.Singleton.demo5;

public class Singleton {
    private Singleton(){}

    private static class SinglenHolder{
        public static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance(){
        return SinglenHolder.INSTANCE;
    }


}
