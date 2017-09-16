package tictactoe;
 
import javax.swing.JFrame;
 
/**
 * This is a simple little TicTacToe game.
 */
public class TicTacToe
{
    public static void main(String[] args)
    {
        JFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setTitle("Phantom TicTacToe Game!");
        ticTacToe.setSize(400,400);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
    }
} // end class TicTacToe