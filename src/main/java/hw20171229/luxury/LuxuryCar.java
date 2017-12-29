/**
 * Project Name:dt59-liupeng
 * File Name:LuxuryCar.java
 * Package Name:hw20171229.luxury
 * Date:2017年12月29日下午4:35:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229.luxury;

import hw20171229.AbstractCar;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午4:35:31 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业3：<br/>
 * 在hw20171228.luxury类包中，编写一个豪华汽车的类，<br/>
 * 要求继承第1题中车的抽象类，重写车的简介方法summary()，<br/>
 * 输出信息中，包括“我是豪车。。。”形式的内容，并添加相应属性方法。<br/>
 */
public class LuxuryCar extends AbstractCar {

    private int price = 5000000;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void summary() {
        System.out.println("我是豪车，来自于宝马公司的汽车类产品！");
    }

    public void speed() {
        System.out.println("我的速度超级快！");
    }
}

