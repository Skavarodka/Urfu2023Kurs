package game;

import javax.swing.*;
import java.awt.*;

public class StartGame extends JFrame {

    public StartGame() {

        initUI();
    }

    private void initUI() {

        add(new Board());


        setResizable(false);
        pack();
        setTitle("GAME");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            StartGame game = new StartGame();
            game.setVisible(true);
        });
    }
}
