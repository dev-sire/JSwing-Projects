import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Flow extends JFrame {

    // FlowLayout: places contents in a row, sized at their preferred size, as the horizontal space within container becomes smaller
    //             it will use the next available row

    Flow(){
        this.setTitle("FlowLayout in Java");
        this.setSize(500,500);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
