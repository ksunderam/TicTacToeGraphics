import javax.swing.*;
import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;
//    private Image x;
//    private Image o;

    private TicTacToeViewer game;
    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col, TicTacToeViewer game)
    {
        this.game = game;
        this.row = row;
        this.col = col;
        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
//        Image x = new ImageIcon("Resources/X.png").getImage();
//        Image o = new ImageIcon("Resources/O.png").getImage();
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    public void draw(Graphics g)
    {
        int a = 150;
        if (this.isWinningSquare)
        {
            g.setColor(Color.GREEN);
            g.fillRect(a*(row+1), a*(col+1), a, a);
            g.setColor(Color.BLACK);
        }
        else
        {
            g.drawRect(a*(row+1), a*(col+1), a, a);
        }

        if (marker.equals(TicTacToe.O_MARKER))
        {
            g.drawImage(game.oImg, a*(row+1), a*(col+1), 100, 100, game);
        }
        else if (marker.equals(TicTacToe.X_MARKER))
        {
            g.drawImage(game.xImg, a*(row+1), a*(col+1), 100, 100, game);
        }


//        g.drawImage(x, a*(row+1), a*(col+1), game);
//        g.drawImage(o, a*(row+1), a*(col+1), game);
//        g.drawRect(a*(row+1), a*(col+1), a, a);


    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }
}
