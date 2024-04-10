import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewPage extends JFrame {
    NewPage(){
        JLabel greet = new JLabel();
        greet.setBounds(100,100,200,100);
        greet.setText("B*****!");
        greet.setFont(new Font("DIALOG", Font.PLAIN, 30));

        this.setTitle("Greetings!!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.add(greet);
        this.setLayout(null);
        this.setVisible(true);
    }
}
