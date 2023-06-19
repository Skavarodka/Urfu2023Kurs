package game;

import java.awt.*;



public class DrawMyObj {

    private final int B_WIDTH = 400;
    private final int B_HEIGHT = 300;

    Board board;

    int[][] array = {
            {71, 126}, {144, 274}, {143, 116}, {81, 168}, {183, 236}, {124, 181}, {250, 233}, {319, 61}, {86, 146}, {356, 259},
            {253, 195}, {235, 194}, {242, 136}, {157, 109}, {173, 137}, {183, 84}, {291, 223}, {156, 27}, {207, 224}, {137, 94},
            {83, 282}, {209, 33}, {385, 164}, {158, 203}, {238, 282}, {396, 37}, {56, 192}, {285, 25}, {224, 292}, {51, 109},
            {291, 152}, {109, 259}, {294, 218}, {107, 113}, {197, 283}, {240, 44}, {144, 236}, {258, 222}, {99, 106}, {333, 57},
            {260, 271}, {90, 202}, {207, 218}, {371, 169}, {291, 159}, {260, 166}, {268, 293}, {216, 118}, {252, 226}, {98, 165},
            {367, 146}, {374, 157}, {134, 184}, {46, 55}, {144, 76}, {12, 174}, {200, 202}, {314, 123}, {373, 363}, {285, 331,},
            {44, 267}, {178, 181}, {242, 259}, {71, 188}, {328, 51}, {183, 397}, {361, 398}, {269, 389}, {271, 145}, {330, 19},
            {223, 385}, {289, 149}, {368, 272}, {79, 258}, {259, 76}, {232, 115}, {213, 196}, {92, 31}, {229, 200}, {217, 97},
            {212, 76}, {10, 328}, {100, 328}, {237, 107}, {195, 351}, {371, 390}, {353, 170}, {64, 102}, {332, 337}, {338, 317},
            {109, 149}, {340, 115}, {139, 93}, {301, 73}, {238, 395}, {318, 363}, {334, 345}, {238, 161}, {388, 245}, {358, 114}
    };

    public DrawMyObj(Board board) {

        this.board = board;
    }

    public void drawStar(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillOval(10, 30, 3, 3);

        for (int[] a : array) {

            g.fillOval(a[0], a[1], 3, 3);
        }
    }

    public void drawStart(Graphics g) {

        String winMessage = "Press Enter to start";
        Font font = new Font("Magneto", Font.BOLD, 17);
        FontMetrics fontMetrics = board.getFontMetrics(font);

        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(winMessage,
                (B_WIDTH - fontMetrics.stringWidth(winMessage)) / 2,
                B_HEIGHT / 2);
    }

    public void drawWin(Graphics g) {

        String winMessage = "Yo Win";
        Font font = new Font("Magneto", Font.BOLD, 17);
        FontMetrics fontMetrics = board.getFontMetrics(font);

        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(winMessage,
                (B_WIDTH - fontMetrics.stringWidth(winMessage)) / 2,
                B_HEIGHT / 2);
    }


    public void drawGameOver(Graphics g) {

        String gameOverString = "Game Over";
        Font font = new Font("Magneto", Font.BOLD, 17);
        FontMetrics fontMetrics = board.getFontMetrics(font);

        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString(gameOverString,
                (B_WIDTH - fontMetrics.stringWidth(gameOverString)) / 2,
                B_HEIGHT / 2);
    }
}
