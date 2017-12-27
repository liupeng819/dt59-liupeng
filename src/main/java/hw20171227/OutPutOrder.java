/**
 * Project Name:dt59-liupeng
 * File Name:DefaultValue.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:42:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:42:53 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业2：<br/>
 * 编写一个类，定义几个属性，同时给属性赋值；<br/>
 * 再定义一个无参数构造方法，在构造方法中，首先输出各属性值到控制台，再给属性赋值；<br/>
 * 观察输出值内容。<br/>
 */
public class OutPutOrder {
    String name = "张三";

    int age = 24;

    String country = "CN";

    /**
     * 无参构造方法里不赋值输出的结果为：张三；24；CN；<br/>
     * 也就是实例属性的值<br/>
     * 
     */
    // public OutPutOrder() {
    // System.out.println(name);
    //
    // System.out.println(age);
    //
    // System.out.println(country);
    // }
    //
    // public static void main(String[] args) {
    //
    // new OutPutOrder();
    //
    // }

    /**
     * 给无参构造方法里赋值之后输出的结果为：李四；26；大汉；<br/>
     * 也就是在构造方法中重新赋值的值<br/>
     * 
     */
    public OutPutOrder() {
        this.name = "李四";
        this.age = 26;
        this.country = "大汉";
        System.out.println(name);

        System.out.println(age);

        System.out.println(country);
    }

    public static void main(String[] args) {

        new OutPutOrder();

    }

}
