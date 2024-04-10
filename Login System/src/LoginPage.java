import java.util.HashMap;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserID:");
    JLabel PasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel("Hello There!");
    JLabel statusLabel = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        PasswordLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(130,0,250,35);
        statusLabel.setBounds(100, 250, 250, 35);
        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));
        statusLabel.setFont(new Font(null,Font.ITALIC,25));
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        frame.add(userIDLabel);
        frame.add(PasswordLabel);
        frame.add(messageLabel);
        frame.add(statusLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource() == loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else{
                    statusLabel.setForeground(Color.red);
                    statusLabel.setText("Incorrect Password");
                }
            }
            else{
                statusLabel.setForeground(Color.red);
                statusLabel.setText("Username not Found!");
            }
        }

    }

    
}
