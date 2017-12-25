/**
 * Project Name:dt59-liupeng
 * File Name:VipCard.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:23:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:23:22 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 编写一个vip卡片类，定义vip等级属性，定义结算方法；结算方法传入购物金额，返回折扣后金额。<br/>
 * 结算方法处理逻辑：根据viP等级属性，给予不同打折优惠。
 * 至尊级：7.5<br/>
 * 钻石级：8<br/>
 * 铂金级：8.5<br/>
 * 黄金级：9<br/>
 * 白银级：9.5<br/>
 */

public class VipCard {

    public static void main(String[] args) {

        VipCard vip = new VipCard();

        Scanner scanner = new Scanner(System.in);

        System.out.println(vip.grade1 + "\n" + vip.grade2 + "\n" + vip.grade3 + "\n" + vip.grade4 + "\n" + vip.grade5);

        System.out.println("请输入对应卡片等级类型的序号：");
        int i = scanner.nextInt();

        System.out.println("请输入购物金额：");
        double money = scanner.nextDouble();

        System.out.println("折扣后的消费金额为：" + vip.discount(i, money));

        scanner.close();
    }

    String grade1 = "1.至尊级：7.5折";

    String grade2 = "2.钻石级：8折";

    String grade3 = "3.铂金级：8.5折";

    String grade4 = "4.黄金级：9折";

    String grade5 = "5.白银级：9.5折";

    double discount(int i, double j) {
        return (0.7 + 0.05 * i) * j;
    }


}

