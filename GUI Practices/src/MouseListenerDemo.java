import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.*;

public class MouseListenerDemo extends JFrame implements MouseListener {

    JLabel label;
    MouseListenerDemo(){
        this.setTitle("Mouse Events In Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(200,200,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when a moise button has been clicked (pressed or released) on a component
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        label.setBackground(Color.ORANGE);
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released from a component
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when Cursor enters the area of a component
        label.setBackground(Color.GREEN);
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when Cursor Exits the area of a component
        label.setBackground(Color.RED);
    }
}
