package com.itwsm.designPatternDemo.design_principle.dependency_inversion.HardDisk;

public class XiJieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("希捷硬盘保存数据:"+data);
    }

    @Override
    public String getData() {
        System.out.println("希捷硬盘获取数据");
        return "数据";
    }
}
