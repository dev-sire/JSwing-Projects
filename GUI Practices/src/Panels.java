import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels extends JFrame {
    Panels(){
        //Panels: A GUI Compinents that functions as a container to hold other components

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JLabel labelText = new JLabel("This is a component");
        labelText.setFont(new Font("Dialog",Font.BOLD,20));
        labelText.setForeground(Color.WHITE);
        labelText.setHorizontalAlignment(JLabel.CENTER);

        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);
        redPanel.setBounds(0,0,250,250);
        bluePanel.setBounds(250,0,250,250);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(labelText);

        this.setTitle("Panels in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,700);
        this.setVisible(true);

        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
    }
}
