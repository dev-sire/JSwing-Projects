import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    WelcomePage(String userID){
        label.setBounds(125,125,200,35);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setText("Welcome! "+userID);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
