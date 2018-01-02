/**
 * Project Name:dt59-liupeng
 * File Name:TestMasterNiuBen.java
 * Package Name:hw20180102.DuoTaiDemo3
 * Date:2018年1月2日下午7:01:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.DuoTaiDemo3;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:01:03 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class TestMasterNiuBen {

    public static void main(String[] args) {

        MasterNiuBen niuBen = new MasterNiuBen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎光临，我的朋友！");
        System.out.println("来的是：1 王小强，2 约翰！");
        int Id = scanner.nextInt();
        // Friend friend = niuBen.getLove(Id);
        System.out.println(niuBen.getLove(Id));
        scanner.close();
    }

}

