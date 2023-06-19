package game;

import java.awt.*;

public class Missile extends Sprite {

    private final int BOARD_WIDTH = 390;

    private final int BOARD_HEIGHT = 290;
    private final int MISSILE_SPEED = 2;

    public Missile() {

        //
    }
    public Missile(int x, int y) {

        super(x, y);

        initMissile();
    }

    private void initMissile() {

        loadImage("src/aimage/misile.png");
        getImageDimension();
    }

    public void moveLeft() {

        x -= MISSILE_SPEED;

        if (x < 0) {

            visible = false;
        }
    }

    public void moveRight() {

        x += MISSILE_SPEED;

        if (x > BOARD_WIDTH) {

            visible = false;
        }
    }

    public static void updateMiss(Missile missile) {

        if (missile.isVisible()) {

            missile.moveRight();
        }
    }

    public static void drawMissile(Graphics g, Missile missile) {

        if (missile.isVisible()) {

            g.drawImage(missile.getImage(), missile.getX(),
                    missile.getY(), null);
        }
    }
}
