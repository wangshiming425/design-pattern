package com.itwsm.designPatternDemo.design_principle.Law_of_Demeter;

//经纪人类
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Agent(Star star, Fans fans, Company company) {
        this.star = star;
        this.fans = fans;
        this.company = company;
    }

    public Agent() {
    }
    //和粉丝见面
    public void metting(){
        System.out.println(star.getName()+"见面"+fans.getName());
    }

    //公司商量
    public void talk(){
        System.out.println(star.getName()+"签约"+company.getName());
    }
}
