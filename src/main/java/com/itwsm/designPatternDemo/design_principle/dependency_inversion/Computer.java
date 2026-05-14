package com.itwsm.designPatternDemo.design_principle.dependency_inversion;

import com.itwsm.designPatternDemo.design_principle.dependency_inversion.HardDisk.HardDisk;
import com.itwsm.designPatternDemo.design_principle.dependency_inversion.cpu.CPU;

public class Computer {
    private CPU cpu;
    private HardDisk hardDisk;

    public CPU getCpu() {
        return cpu;
    }

    public Computer() {
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Computer(CPU cpu, HardDisk hardDisk) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }

    public void run() {
        System.out.println("计算机开始运行");
        cpu.run();
        ;
        String data = hardDisk.getData();
        System.out.println("硬盘中存储" + data);
    }
}
