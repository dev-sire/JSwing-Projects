import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Comboboxes extends JFrame implements ActionListener{
    JComboBox<String> comboBox;
    Comboboxes(){
        this.setTitle("Combo Boxes in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] animals = {"Cats","Dogs","Birds","Fish"};
        comboBox = new JComboBox<String>(animals);
        comboBox.addActionListener(this);
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
            System.out.println("Selected Animal: "+ comboBox.getSelectedItem());
        }
    }

}