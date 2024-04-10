import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogueBox extends JFrame {
    // JOptionPane: pop up a standard dialogue box to prompt the user for a value or to inform them of something

    DialogueBox(){
        JOptionPane.showMessageDialog(null, "Some useless Information", "Dialogue Box in Java", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Some More Useless Information", "Dialogue Box in Java", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Really?", "Dialogue Box in Java", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your Computer has VIRUS!!", "Dialogue Box in Java", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Visit TECH support NOW!!", "Dialogue Box in Java", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Bro, Do you even code?", "Dialogue Box in Java", JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog(null, "What is Your Name?");
        System.out.println("Hello "+ name);

        JOptionPane.showOptionDialog(null, "You are Awesome", "Dialogue Boxes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);

    }
}
