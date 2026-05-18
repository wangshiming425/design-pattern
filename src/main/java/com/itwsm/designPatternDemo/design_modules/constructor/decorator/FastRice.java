package com.itwsm.designPatternDemo.design_modules.constructor.decorator;

public class FastRice extends FastFood{
    public FastRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
