import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int screenWidth = 600;
        int screenHeight = 600;
        JFrame frame = new JFrame("SnakeMania By Dev-Sire");
        ImageIcon image = new ImageIcon("GameLogo.png");
        frame.setVisible(true);
        frame.setSize(screenWidth,screenHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(screenWidth, screenHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
