package game;



import java.awt.*;
import java.awt.event.KeyEvent;


public class Player1 extends Sprite {

    private int dx;
    private int dy;
    private Missile missile;

    public Player1(int x, int y) {

        super(x, y);

        initProtagonist();
    }

    protected static void updateProtagonist(Player1 player1) {

        if (player1.isVisible()) player1.move();
    }

    private void initProtagonist() {

        missile = new Missile();
        loadImage("src/aimage/player.png");
        getImageDimension();
    }

    public void move() {

        x += dx;
        y += dy;
        // границы экрана за которые нельзя заходить
        if (x < 1) x = 1;
        if (y < 1) y = 1;
        if (y > INITIAL_Y - height) y = INITIAL_Y - height;
    }

    public Missile getMissiles() {

        return missile;
    }

    public void fire() {

        //missiles.add(new Missile(x + width, y + height / 2));
        //y + height / 2 для того чтобы пули летели ровно из яблока
        //y + height пульки будут лететь снизу из пустого пространства
        if (!missile.isVisible()) {

            missile = new Missile(x + width, y + height/2);
        }
    }

    public static void drawPlayer(Graphics g, Player1 player1) {

        if (player1.isVisible()) {

            g.drawImage(player1.getImage(), player1.getX(),
                    player1.getY(), null);
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {

           fire();
        }

        if (key == KeyEvent.VK_LEFT) {

            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {

            dy = -1;
        }

        if ((key == KeyEvent.VK_DOWN)) {

            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {

            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {

            dy = 0;
        }
    }
}
