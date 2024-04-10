import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage extends JFrame implements ActionListener {
    JButton button1 = new JButton("New Window");
    LaunchPage(){
        button1.setBounds(100,100,200,50);
        button1.setFocusable(false);
        button1.addActionListener(this);

        this.setTitle("Open a new Window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button1);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            this.dispose();
            new NewPage();
        }
    }
}
