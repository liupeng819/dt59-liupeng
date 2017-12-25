/**
 * Project Name:dt59-liupeng
 * File Name:CreatMethodCompare.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:04:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:04:00 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */

/*
 * 编写一个方法，传入两个数值，返回较大的一个值；
 */
public class CreatMethodCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreatMethodCompare compare = new CreatMethodCompare();
        System.out.println("第一个数：");
        int i = scanner.nextInt();
        System.out.println("第二个数：");
        int j = scanner.nextInt();
        System.out.println("较大数为：");
        System.out.println(compare.max(i, j));
        scanner.close();
    }

    int max(int i, int j) {
        return (i > j) ? i : j;
    }
}

