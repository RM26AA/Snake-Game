import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);      //makes screen open on centre of screen
        frame.setResizable(false);      //makes screen un-resizable for user, user can't change size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //terminate program when user clicks corner X

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();   //place JPanel inside frame with full dimensions
        snakeGame.requestFocus();
    }
}