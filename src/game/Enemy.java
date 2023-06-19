package game;


import java.awt.*;
import java.util.List;
import java.util.Random;

public class Enemy extends Sprite {

    Random thrnd = new Random();

    public Enemy (int x, int y) {

        super(x, y);
        initEnemy();
    }

    private void initEnemy() {

        loadImage("src/aimage/asteroid.png");
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

    public static void drawEnemy(Graphics g, List<Enemy> enemies) {

        for (Enemy enemy : enemies) {

            if (enemy.isVisible()) {

                g.drawImage(enemy.getImage(), enemy.getX(),
                        enemy.getY(), null);
            }
        }
    }

    protected static void updateEnemy(List<Enemy> enemies) {

        if (enemies.isEmpty()) {

            return;
        }

        for (int i = 0; i < enemies.size(); i++) {

            Enemy enemy = enemies.get(i);

            if (enemy.isVisible()) {

                enemy.move();
            } else {

                enemies.remove(i);
            }
        }
    }
}
