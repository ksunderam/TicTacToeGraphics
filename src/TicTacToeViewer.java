import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class TicTacToeViewer extends JFrame
{
    private TicTacToe game;
    private int WINDOW_WIDTH = 750;
    private int WINDOW_HEIGHT = 750;
    public static Image xImg;
    public static Image oImg;
    private String[] a;

    // TODO: Complete this class
    public TicTacToeViewer(TicTacToe game)
    {
        this.game = game;
        a = new String[]{"0", "1", "2"};
        Image x = new ImageIcon("Resources/X.png").getImage();
        Image o = new ImageIcon("Resources/O.png").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Toe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);


    }

    public void paint(Graphics g)
    {
        // TODO: Write the paint method.
        g.drawImage(xImg,
                0, 0,
                this);
        for (int i = 0; i < 3; i++)
        {
            g.drawString(a[i], 150*(i+1)+85, 140);
            g.drawString(a[i], 140, 150*(i+1)+85);
            for (int j = 0; j < 3; j++)
            {
                game.getBoard()[i][j].draw(g);
            }
        }

        if (game.getGameOver() == true)
        {
            if (game.checkTie() == true)
            {
                g.drawString("It's a tie", 350, 500);
            }
            else
            {
                g.drawString(game.getWinner() + " wins!", 350, 500);
            }
        }




//        for (int i = 0; i < game.getBoard().length; i++)
//        {
//            for (int j = 0; j < game.getBoard()[i].length; j++)
//            {
//
//            }
//        }


        //g.

        /*for (int i = 1; i < 4; i++)
        {
            g.drawLine(WINDOW_WIDTH / 5 * i, WINDOW_HEIGHT / 5 * i, WINDOW_WIDTH / 5 * i, WINDOW_HEIGHT / 5 * (i + 1));
        }*/





        /*g.drawImage(background,
                0, 0,
                this);
        for (int i = 0; i < a.getFishes().length; i++)
        {
            a.getFishes()[i].draw(g);
        }*/

    }

//    public Image getEx()
//    {
//        return xImg;
//    }
//
//    public Image getO()
//    {
//        return o;
//    }
}
