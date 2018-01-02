/**
 * Project Name:dt59-liupeng
 * File Name:MasterNiuBen.java
 * Package Name:hw20180102.DuoTaiDemo3
 * Date:2018年1月2日下午7:00:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.DuoTaiDemo3;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:00:50 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class MasterNiuBen {
    public Friend getLove(int Id) {

        Friend friend = null;
        if (Id == 1) {
            System.out.println("王小强");
            friend = new WangXiaoQiang();
            WangXiaoQiang xiaoQiang = (WangXiaoQiang) friend;
            xiaoQiang.eat();
            xiaoQiang.sport();
        } else if (Id == 2) {
            System.out.println("约翰");
            friend = new John();
            John john = (John) friend;
            john.eat();
        }
        return friend;// 返回值出现了该类包路径和哈希值，不知道如何解决！
    }
}

