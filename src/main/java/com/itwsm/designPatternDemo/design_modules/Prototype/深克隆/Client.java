package com.itwsm.designPatternDemo.design_modules.Prototype.深克隆;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealsizeType realsizeType=new RealsizeType(new Student());
        realsizeType.getStudent().setName("小明");
        realsizeType.getStudent().setAge(18);
        RealsizeType clone = realsizeType.clone();
        clone.getStudent().setName("王士明");
        clone.getStudent().setAge(20);
        System.out.println(realsizeType);
        System.out.println(clone);
        System.out.println(realsizeType.getStudent());
        System.out.println(clone.getStudent());
    }
}
