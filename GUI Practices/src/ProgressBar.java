import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame {

    JProgressBar bar = new JProgressBar(0,100);
    ProgressBar(){
        this.setTitle("Progress Bar In Java");
        bar.setValue(0);
        bar.setBounds(0,100, 450, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(450,450);
        this.add(bar);
        this.setVisible(true);
        fill();
    }   
    public void fill(){
        int counter = 100;
        while(counter>=0){
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter -= 1;
        }
        bar.setString("Done!");
    }
    
}
