package com.itwsm.designPatternDemo.design_modules.constructor.proxy.Static;

//真实主题类,实现了卖火车票的功能
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖火车票");
    }
}
