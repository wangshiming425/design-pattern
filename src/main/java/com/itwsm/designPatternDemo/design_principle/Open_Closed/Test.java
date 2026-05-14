package com.itwsm.designPatternDemo.design_principle.Open_Closed;

/**
 * 运用了开闭原则,扩展只需要新增实现类,而不是去修改已有的类
 */



public class Test {
    public static void main(String[] args) {
        //1.生成一个搜狗输入法对象
        SouGou souGou=new SouGou();
        //2为它设置皮肤属性
        GameSkin skin=new GameSkin();
        souGou.setAbstractSkin(skin);
        //3.展示皮肤
        souGou.display();
    }
}
