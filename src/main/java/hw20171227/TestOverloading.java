/**
 * Project Name:dt59-liupeng
 * File Name:MainConstrutor.java
 * Package Name:work4
 * Date:2017年12月27日下午4:15:57
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;


/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:15:57 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业4：<br/> 编写一个类，定义三个以上属性，并定义三个构造方法；<br/>
 * 再编写一个类，定义main方法，用三种方式构造前一个类的实例对象；<br/>
 * 
 * 有参构造方法调用：<br/>
 */

public class TestOverloading {

    public static void main(String[] args) {
        

        new Overloading("王五");
        new Overloading("张三", 20);
        new Overloading("张三", 20, "中国");

    }

}

