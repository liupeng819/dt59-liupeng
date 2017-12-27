/**
 * Project Name:dt59-liupeng
 * File Name:ConstrutorMethod.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:49:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:49:26 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业4：<br/> 编写一个类，定义三个以上属性，并定义三个构造方法；<br/>
 * 再编写一个类，定义main方法，用三种方式构造前一个类的实例对象；<br/>
 * 
 * 有参构造方法：<br/>
 */
public class Overloading {
    String name;

    int age;

    String country;

    public Overloading(String name) {

        this.name = name;


    }

    public Overloading(String name, int age) {
        this(name);
        this.age = age;


    }

    public Overloading(String name, int age, String country) {
        this(name, age);
        this.country = country;
    }
}

