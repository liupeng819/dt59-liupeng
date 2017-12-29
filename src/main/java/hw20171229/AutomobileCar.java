/**
 * Project Name:dt59-liupeng
 * File Name:AutomobileCar.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午3:53:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:53:28 <br/>
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

/*
 * 作业2：<br/>
 * 接第1题，在小汽车类中，添加输出小汽车整体介绍信息方法，<br/>
 * 方法中，除输出小洗车本类中的属性外，还要输出父类中的属性信息。<br/>
 */

public class AutomobileCar extends AbstractCar {

    private String type = "法拉利";

    public void height() {
        System.out.println("我只有1.5m高！");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    AutomobileCar(String type, String model, int tyre) {
        System.out.println(this.getType());
//        super.getModel();
//        super.getTyre();
        // this.setTyre(4);
        System.out.println(this.getCompany());
        System.out.println(this.getTyre());
    }
}

