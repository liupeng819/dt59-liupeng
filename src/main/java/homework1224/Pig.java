/**
 * Project Name:dt59-liupeng
 * File Name:Pig.java
 * Package Name:homework1224
 * Date:2017年12月24日下午1:57:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework1224;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午1:57:14 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/**
 * 编写一个类，描述你喜欢的一类宠物，要求定义三种属性、三个方法；
 */
public class Pig {

    String name;

    String color;

    int age;

    String eat() {
        return "啥都吃";
    }

    void run() {
        System.out.println("跑的又不快");
    }

    void shout() {
        System.out.println("声音老大了");
    }
}

