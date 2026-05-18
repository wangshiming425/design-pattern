package com.itwsm.designPatternDemo.design_modules.constructor.decorator;

public class FastMian extends FastFood{
    public FastMian(){
        super(12,"炒面");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
