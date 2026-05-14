package com.itwsm.designPatternDemo.design_principle.dependency_inversion;

import com.itwsm.designPatternDemo.design_principle.dependency_inversion.HardDisk.HardDisk;
import com.itwsm.designPatternDemo.design_principle.dependency_inversion.HardDisk.XiJieHardDisk;
import com.itwsm.designPatternDemo.design_principle.dependency_inversion.cpu.CPU;
import com.itwsm.designPatternDemo.design_principle.dependency_inversion.cpu.IntelCPU;
import com.itwsm.designPatternDemo.design_principle.dependency_inversion.cpu.YinWeiDaCpu;

public class Test{
    public static void main(String[] args) {
        Computer mycompuet=new Computer();
        CPU cpu=new YinWeiDaCpu();
        HardDisk hardDisk=new XiJieHardDisk();
        mycompuet.setCpu(cpu);
        mycompuet.setHardDisk(hardDisk);
        mycompuet.run();

    }
}
