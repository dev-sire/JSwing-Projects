import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels extends JFrame {
    Labels(){

        ImageIcon developer_image = new ImageIcon("Developer_img.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.GREEN,3,true);
        label.setText("Bro, Do You even Code?");
        label.setIcon(developer_image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00ff00));
        label.setFont(new Font("Mv Boli",Font.PLAIN,40));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.setTitle("Labels In JSwing");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.add(label);
    }
    
}
