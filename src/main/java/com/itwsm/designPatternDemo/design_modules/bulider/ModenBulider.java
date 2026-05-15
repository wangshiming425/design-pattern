package com.itwsm.designPatternDemo.design_modules.bulider;

public class ModenBulider extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
