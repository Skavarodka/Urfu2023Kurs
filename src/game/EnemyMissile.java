package game;

import java.awt.*;

public class EnemyMissile extends Missile {

    //

    public EnemyMissile() {
        //
    }
    public EnemyMissile(int x, int y) {

        super(x, y);

        initMissile();
    }

    private void initMissile() {

        loadImage("src/aimage/emisile.png");
        getImageDimension();
    }

    @Override
    public void moveLeft() {

        x -= 9;

        if (x < 0) {

            visible = false;
        }
    }

    public static void drawEnemyMiss(Graphics g, EnemyMissile enemyMissile) {

        if (enemyMissile.isVisible()) {

            g.drawImage(enemyMissile.getImage(), enemyMissile.getX(),
                    enemyMissile.getY(), null);
        }
    }

    protected static void updateEnMiss(EnemyMissile enemyMissile) {

        if (enemyMissile.getX() != 0) {

            enemyMissile.moveLeft();
        } else {

            enemyMissile.setVisible(false);
        }
    }
}
