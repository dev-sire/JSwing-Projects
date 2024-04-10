import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerDemo extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    KeyListenerDemo(){
        this.setTitle("KeyListener's in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.BLACK);
        this.addKeyListener(this);
        this.setLayout(null);

        icon = new ImageIcon("rocket2.png");
        label = new JLabel();
        label.setBounds(240, 240, 100, 100);
        label.setIcon(icon);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a key is Typed. Uses KeyChar, Char Output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());                
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);                
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());                
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);                
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Invoked when a physical key is pressed down. Uses KeyCode, int Output
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());                
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);                
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());                
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);                
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Invoked when a key is released
        // System.out.println("You Released: "+ e.getKeyChar());
    }
    
    
}
