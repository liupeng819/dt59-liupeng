/**
 * Project Name:dt59-liupeng
 * File Name:TestStatic.java
 * Package Name:work6
 * Date:2017年12月27日下午5:04:48
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;


/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午5:04:48 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业6：<br/> 编写一个类，定义两个属性，其中一个属性前添加static关键字；<br/>
 * 再定义两个方法，其中一个方法前添加static关键字；<br/>
 * 再编写一个类，定义main方法，在main方法中，分别输出前一个类的两个属性，以及调用两个方法；<br/>
 * 注意观察不同处，并写上注释<br/>
 */
public class TestStatic {

    public static void main(String[] args) {

        Static person = new Static();
        System.out.println(person.name);
        System.out.println(Static.age);
        System.out.println(person.exercise());
        System.out.println(Static.eat());
    }

}

