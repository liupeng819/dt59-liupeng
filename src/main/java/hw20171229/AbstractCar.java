/**
 * Project Name:dt59-liupeng
 * File Name:AbstractCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午2:49:08
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午2:49:08 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业1：<br/>
 * 在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，<br/>
 * 输出车的概要信息，再自由定义两个属性、两个方法；定义一个小汽车的类和大卡车的类，<br/>
 * 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法<br/>
 */

public abstract class AbstractCar {

    private String company;

    private int tyre;

    public void summary() {
        System.out.println("我是来自于宝马公司的汽车类产品！");
    }

    public String site(int site) {
        return "AbstractCar 我能载超过" + site + "个人";
    }

    public String run() {
        return "我能在10S内加速到100km/h！";
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

}

