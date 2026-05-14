package com.itwsm.designPatternDemo.design_principle.Open_Closed;

public class SouGou {
    private AbstractSkin abstractSkin;

    public SouGou(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public SouGou() {
    }
    public void display(){
        abstractSkin.display();;
    }

    public AbstractSkin getAbstractSkin() {
        return abstractSkin;
    }

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }
}
