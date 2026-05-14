package com.itwsm.designPatternDemo.design_principle.Law_of_Demeter;

public class Test {
    public static void main(String[] args) {
        Star star = new Star("蔡徐坤");
        Fans fans = new Fans("陀螺坤哥");
        Company company = new Company("金星影业");

        Agent agent = new Agent(star, fans, company);
        agent.metting();
        agent.talk();
    }

}
