import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;

public class ColorChooser extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    ColorChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("Pick a Color");
        label = new JLabel();
        button.addActionListener(this);

        label.setBackground(Color.WHITE);
        label.setText("Color Me!");
        label.setFont(new Font("Consolas",Font.ITALIC, 70));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            // JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
            label.setForeground(color);
        }
        
    }
}
