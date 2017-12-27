/**
 * Project Name:dt59-liupeng
 * File Name:PrivateMethod.java
 * Package Name:work5
 * Date:2017年12月27日下午4:39:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:39:31 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业5：<br/>
 * 编写一个类，定义几个属性，每个属性前添加private修饰符；<br/>
 * 为每个属性，添加get/set方法，方法前添加public修饰符；<br/>
 * 再编写一个类，定义main方法，在main方法中，构造前一个类的实例对象，<br/>
 * 并调用实例对象的set方法，设置对应数据值；最后调用get方法，输出对应属性值到控制台。<br/>
 */
public class PrivateMethod {
    private String name;

    private int age;

    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

