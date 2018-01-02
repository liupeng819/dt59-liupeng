/**
 * Project Name:dt59-liupeng
 * File Name:WangXiaoQiang.java
 * Package Name:hw20180102.DuoTaiDemo3
 * Date:2018年1月2日下午6:59:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.DuoTaiDemo3;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午6:59:44 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class WangXiaoQiang extends Friend {
    private String country = "CN";

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void eat() {
        System.out.println("他喜欢吃四川菜！");
    }

    public void sport() {
        System.out.println("他喜欢打太极！");
    }
}

