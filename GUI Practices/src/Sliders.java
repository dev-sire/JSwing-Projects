import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders extends JFrame implements ChangeListener {
    // JSlider: A GUI component that lets the user enter a value by an adjustable sliding knob on the Track

    JSlider slider;
    JPanel panel;
    JLabel label;

    Sliders(){
        this.setTitle("Slider In Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(300,400));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        
        label.setText("Celcius: "+ slider.getValue());
        label.setFont(new Font("MV Boli",Font.PLAIN,25));
        label.setPreferredSize(new Dimension(200,200));
        
        panel.add(slider);
        panel.add(label);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        if(slider.getValue() >=70){
            label.setForeground(Color.RED);
        }
        else if(slider.getValue()<=25){
            label.setForeground(Color.BLUE);
        }
        else{
            label.setForeground(Color.GREEN);
        }
        label.setText("Celcius: "+ slider.getValue());
        
    }
}
