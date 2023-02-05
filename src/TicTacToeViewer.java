import javax.swing.*;
import java.awt.*;
public class TicTacToeViewer extends JFrame
{
    //instance of TicTacToe to access the back end
    private TicTacToe game;
    //to set window size
    private int WINDOW_WIDTH = 750;
    private int WINDOW_HEIGHT = 750;
    //the two images, x and o
    public static Image xImg;
    public static Image oImg;
    //to write the little indicators that tell position on board
    private String[] a;

    // TODO: Complete this class
    public TicTacToeViewer(TicTacToe game)
    {
        this.game = game;
        a = new String[]{"0", "1", "2"};
        xImg = new ImageIcon("Resources/X.png").getImage();
        oImg = new ImageIcon("Resources/O.png").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Toe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g)
    {
        // TODO: Write the paint method.
        //for loop that is 3 by 3, like the board
        for (int i = 0; i < 3; i++)
        {
            //draws the indicators that tell position
            g.drawString(a[i], 150 * (i + 1) + 85, 140);
            g.drawString(a[i], 140, 150 * (i + 1) + 85);
            for (int j = 0; j < 3; j++)
            {
                //calls the square's draw function for each square
                game.getBoard()[i][j].draw(g);
            }
        }
        //prints game results
        if (game.getGameOver() == true)
        {
            if (game.checkTie() == true)
            {
                g.drawString("It's a tie", 350, 650);
            }
            else
            {
                g.drawString(game.getWinner() + " wins!", 350, 650);
            }
        }
    }
}
