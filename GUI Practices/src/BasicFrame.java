import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class BasicFrame extends JFrame {

    BasicFrame(){
        this.setTitle("Hello Java....!");
        this.setSize(400,400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("testLogo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));
    }
    
}
