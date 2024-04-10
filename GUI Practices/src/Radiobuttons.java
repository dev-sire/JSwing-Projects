import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radiobuttons extends JFrame implements ActionListener {
    JRadioButton course1;
    JRadioButton course2;
    JRadioButton course3;
    Radiobuttons(){
        this.setTitle("Radio Buttons in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        course1 = new JRadioButton("Essentials of SQL");
        course2 = new JRadioButton("Java Database Connectivity (JDBC)");
        course3 = new JRadioButton("Android Development In Java");
        course1.addActionListener(this);
        course2.addActionListener(this);
        course3.addActionListener(this);
        ButtonGroup selectOneCourse = new ButtonGroup();
        selectOneCourse.add(course1);
        selectOneCourse.add(course2);
        selectOneCourse.add(course3);
        
        this.add(course1);
        this.add(course2);
        this.add(course3);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == course1){
            System.out.println("Course Selected: ESSENTIALS OF SQL");
        }
        else if(e.getSource() == course2){
            System.out.println("Course Selected: JAVA DATABASE CONNECTIVITY");
        }
        else if(e.getSource() == course3){
            System.out.println("Course Selected: ANDROID DEVELOPMENT IN JAVA");
        } 
    }
}
