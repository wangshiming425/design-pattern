package com.itwsm.designPatternDemo.design_modules.constructor.decorator;

public class Egg extends Extra{
    public Egg(){
        super(1, "炒蛋", new FastFood() {
            @Override
            public float cost() {
                return 0;
            }
        });
    }
    @Override
    public float cost() {

        return 1.1F;
    }
}
