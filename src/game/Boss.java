package game;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class Boss extends Sprite {

    Random thrnd = new Random();

    public Boss(int x, int y) {

        super(x, y);
        initBoss();
    }

    private void initBoss() {

        String s = "src/aimage/Boss.png";
        loadImage(s);
        getImageDimension();
    }

    public void move() {

        //
        if (x < 0) {

            x = INITIAL_X + thrnd.nextInt(100);
            y = thrnd.nextInt(INITIAL_Y - this.height);
        }
        x -= 1;
    }

    public static void drawBoss(Graphics g, Boss boss) {

        if (boss.isVisible()) {

            g.drawImage(boss.getImage(), boss.getX(), boss.getY(), null);
        }
    }

    public static void drawBossList(Graphics g, List<Boss> bossList) {

        for (Boss boss : bossList) {

            if (boss.isVisible()) {

                g.drawImage(boss.getImage(), boss.getX(), boss.getY(), null);
            }
        }
    }

    public static void updateBoss(Boss boss) {

        if (boss.isVisible()) {

            boss.move();
        }
    }

    public static void updateBossList(List<Boss> bossList) {

        for (int i = 0; i < bossList.size(); i++) {

            Boss boss = bossList.get(i);

            if (boss.isVisible()) {

                boss.move();
            } else {

                bossList.remove(i);
            }
        }
    }
}
