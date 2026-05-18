package com.itwsm.designPatternDemo.design_modules.constructor.decorator;

public abstract class Extra extends FastFood{
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Extra(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public Extra(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
