import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFields extends JFrame implements ActionListener {

    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();
    TextFields(){
        this.setTitle("TextFields in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);
        textField.setPreferredSize(new Dimension(300,40));
        textField.setFont(new Font("Consolas", Font.BOLD, 25));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("Message....");
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Input Value "+ textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }

    }
    
}
