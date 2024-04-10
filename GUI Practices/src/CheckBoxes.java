import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CheckBoxes extends JFrame implements ActionListener {
    // JCheckBox: A GUI component that can be Selected or Deselected
    JCheckBox checkBox;
    JButton button;
    CheckBoxes(){
        this.setTitle("CheckBoxes in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am not a Robot!");
        checkBox.setFont(new Font("Consolas", Font.BOLD, 30));
        checkBox.setFocusable(false);

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("CheckBox: "+ checkBox.isSelected());
        }
    }
    
}
