package com.itwsm.designPatternDemo.design_modules.constructor.proxy.Synamic.jdk;

public class WeChat implements SendMessage{
    @Override
    public void send() {
        System.out.println("微信发送消息");
    }
}
