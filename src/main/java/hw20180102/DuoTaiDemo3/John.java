/**
 * Project Name:dt59-liupeng
 * File Name:John.java
 * Package Name:hw20180102.DuoTaiDemo3
 * Date:2018年1月2日下午7:00:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.DuoTaiDemo3;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:00:11 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class John extends Friend {
    private String country = "USA";

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void eat() {
        System.out.println("他喜欢吃披萨！");
    }

    public void ball() {
        System.out.println("他喜欢打橄榄球！");
    }
}

