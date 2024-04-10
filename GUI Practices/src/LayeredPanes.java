import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPanes extends JFrame {
    // JLayeredPane: A swing component that provides a third dimension for positioning elements ex. depths or Z-Index

    LayeredPanes(){
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLayeredPane layeredPane = new JLayeredPane();

        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2, JLayeredPane.DRAG_LAYER);
        layeredPane.add(label3, JLayeredPane.DEFAULT_LAYER);
        label1.setOpaque(true);
        label1.setBounds(50,50,200,200);
        label1.setBackground(Color.RED);
        label2.setOpaque(true);
        label2.setBounds(100,100,200,200);
        label2.setBackground(Color.GREEN);
        label3.setOpaque(true);
        label3.setBounds(150,150,200,200);
        label3.setBackground(Color.BLUE);

        this.setTitle("Layered Panes in Java");
        this.add(layeredPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
