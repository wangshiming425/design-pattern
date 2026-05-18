package com.itwsm.designPatternDemo.design_modules.creator.Prototype.深克隆;

import java.io.Serializable;

public class RealsizeType implements Cloneable , Serializable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public RealsizeType(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "RealsizeType{" +
                "student=" + student +
                '}';
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //深克隆
    @Override
    public RealsizeType clone() throws CloneNotSupportedException {
        RealsizeType realsizeType = CloneUtils.deepClone(this);
        return realsizeType;
    }
}
