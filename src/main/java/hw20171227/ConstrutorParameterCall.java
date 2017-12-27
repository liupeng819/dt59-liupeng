/**
 * Project Name:dt59-liupeng
 * File Name:ConstrutorParameterCall.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:18:02
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:18:02 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 作业3：<br/> 编写一个类，定义几个属性，再定义一个带参构造方法，（参数包括所有属性）；<br/>
 * 再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值；<br/>
 */
public class ConstrutorParameterCall {
    String name;

    int age;

    String country;

    // public ConstrutorParameterCall() {
    //
    // }

    public ConstrutorParameterCall(String name, int age, String country) {

        this.name = name;
        this.age = age;
        this.country = country;
        System.out.println(name);

        System.out.println(age);

        System.out.println(country);

    }
}

