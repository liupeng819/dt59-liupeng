/**
 * Project Name:dt59-liupeng
 * File Name:TestTypeDefaultValue.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:10:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;



/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:10:50 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/**
 * 作业1：<br/>
 * 编写一个类TypeDefaultValue，并定义十个属性，前八个属性分别定义为8种基本数据类型；<br/>
 * 最后两属性类型分别定义为String和int[];<br/>
 * 编写另一个类TestTypeDefaultValue，定义main方法，在main方法，<br/>
 * 输出TypeDefaultValue类对象的每一个属性值；<br/>
 * 观察每种类型属性，默认值是什么，并以注释的形式在属性前说明。<br/>
 */

public class TestTypeDefaultValue {

    public static void main(String[] args) {

        TypeDefaultValue value = new TypeDefaultValue();

        /**
         * byte类型的默认值：0
         */
        System.out.println(value.a);

        /**
         * short类型的默认值：0
         */
        System.out.println(value.b);

        /**
         * int类型的默认值：0
         */
        System.out.println(value.c);

        /**
         * long类型的默认值：0
         */
        System.out.println(value.d);

        /**
         * float类型的默认值：0.0
         */
        System.out.println(value.e);

        /**
         * double类型的默认值：0.0
         */
        System.out.println(value.f);

        /**
         * boolean类型的默认值：falae
         */
        System.out.println(value.g);

        /**
         * char类型的默认值：代表0的ASCLL值
         */
        System.out.println(value.h);
        /**
         * String类型的默认值：null
         */
        System.out.println(value.i);

        /**
         * 数组int[]的默认值：null <br/>
         * 数组int[]中的元素默认值：0 <br/>
         */
        System.out.println(value.j[0]);

        System.out.println(value.j);

        System.out.println(value.k);

        System.out.println(value.k[0]);

    }

}

