package com.itwsm.designPatternDemo.design_principle.Interface_Segregation;

public class Test {
    public static void main(String[] args) {
        HeimaDoor door=new HeimaDoor();
        door.fireproof();
        door.safeproof();
        door.waterproof();
        System.out.println("=====================");
        MyDoor door1=new MyDoor();
        door1.safeproof();
        door1.waterproof();
    }
}