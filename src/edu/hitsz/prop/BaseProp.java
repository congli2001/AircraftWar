package edu.hitsz.prop;

import edu.hitsz.application.Main;
import edu.hitsz.basic.AbstractFlyingObject;


/**
 * 抽象道具类
 * @author LICONG
 */
public class BaseProp extends AbstractFlyingObject {

    public BaseProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX,locationY,speedX,speedY);
    }

    @Override
    public void forward() {
        super.forward();

        // 判定 y 轴出界
        if (speedY > 0 && locationY >= Main.WINDOW_HEIGHT ) {
            // 向下飞行出界
            vanish();
        }
    }
}
