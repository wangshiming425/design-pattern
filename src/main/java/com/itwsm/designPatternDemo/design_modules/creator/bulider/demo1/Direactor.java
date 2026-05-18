package com.itwsm.designPatternDemo.design_modules.creator.bulider.demo1;

public class Direactor {
    private Builder builder;

    public Direactor(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
