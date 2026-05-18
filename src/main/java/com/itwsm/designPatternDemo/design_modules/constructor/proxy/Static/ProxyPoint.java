package com.itwsm.designPatternDemo.design_modules.constructor.proxy.Static;

//代理对象,内部持有真实主题类,可以对它的功能增强
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation=new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理了火车代理点");
        trainStation.sell();
    }
}
