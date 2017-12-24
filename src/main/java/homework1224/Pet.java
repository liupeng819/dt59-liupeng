/**
 * Project Name:dt59-liupeng
 * File Name:Pet.java
 * Package Name:homework1224
 * Date:2017年12月24日下午2:06:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework1224;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午2:06:26 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class Pet {

    public static void main(String[] args) {

        Pig pig = new Pig();
        pig.name = "花花";
        pig.age = 1;
        pig.color = "白色";
        pig.run();// 跑的又不快
        System.out.println("宠物的名字：" + pig.name);
        System.out.println(pig.eat());

    }

}

