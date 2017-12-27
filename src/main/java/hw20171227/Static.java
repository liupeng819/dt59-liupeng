/**
 * Project Name:dt59-liupeng
 * File Name:Static.java
 * Package Name:work6
 * Date:2017年12月27日下午4:52:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:52:22 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业6：<br/>
 * 编写一个类，定义两个属性，其中一个属性前添加static关键字；<br/>
 * 再定义两个方法，其中一个方法前添加static关键字；<br/>
 * 再编写一个类，定义main方法，在main方法中，分别输出前一个类的两个属性，以及调用两个方法；<br/>
 * 注意观察不同处，并写上注释<br/>
 */
public class Static {
    String name = "刘奇";

    static int age = 20;

    public String exercise() {
        return "喜欢打篮球";
    }

    public static String eat() {
        return "喜欢吃肉";
    }
}

