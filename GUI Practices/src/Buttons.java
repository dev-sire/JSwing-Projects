import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttons extends JFrame {
    JButton Button;
    Buttons(){
        // JButtons: a Java GUI button that performs an action when it is clicked upon

        Button = new JButton();
        Button.addActionListener(e -> System.out.println("Visit My Github ;)"));
        Button.setBounds(100,100,200,100);
        Button.setText("**Visit**");
        Button.setFont(new Font("Dialog",Font.ITALIC, 30));
        Button.setFocusable(false);
        Button.setBorder(BorderFactory.createEtchedBorder());

        this.setTitle("Buttons in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(450,450);
        this.setVisible(true);

        this.add(Button);

    }
}
