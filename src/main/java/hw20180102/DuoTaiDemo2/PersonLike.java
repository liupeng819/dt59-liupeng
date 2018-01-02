/**
 * Project Name:dt59-liupeng
 * File Name:PensonLike.java
 * Package Name:hw20180102.DuoTaiDemo2
 * Date:2018年1月2日下午6:22:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102.DuoTaiDemo2;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午6:22:25 <br/>
 * @author   LiuPeng
 * @version
 * @see
 */
public class PersonLike {
    public void waste(Person person) {

        if (person instanceof Man) {
            Man man = (Man) person;
            man.wasteTime();
            man.play();
        } else if (person instanceof Woman) {
            Woman woman = (Woman) person;
            woman.wasteTime();
            woman.shopping();
        }
    }
}

