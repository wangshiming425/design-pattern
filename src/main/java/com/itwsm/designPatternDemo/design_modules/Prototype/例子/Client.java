package com.itwsm.designPatternDemo.design_modules.Prototype.例子;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("小明", 1);
        //以此为模型复制几份奖状出来,修改名字
        Citation citation1 = citation.clone();
        Citation citation2 = citation.clone();
        citation1.setName("小美");
        citation1.setId(2);
        citation2.setId(3);
        citation2.setName("小帅");
        System.out.println(citation);
        System.out.println(citation1);
        System.out.println(citation2);
    }
}
