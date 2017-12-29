/**
 * Project Name:dt59-liupeng
 * File Name:TruckCar.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午3:53:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:53:47 <br/>
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
public class TruckCar {

    private String type = "重卡";

    public void length() {
        System.out.println("我有6m长！");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

