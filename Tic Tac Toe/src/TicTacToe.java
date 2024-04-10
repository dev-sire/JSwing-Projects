import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    ImageIcon image = new ImageIcon("testLogo.png");
    boolean player1_turn;

    TicTacToe(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("DIALOG",Font.BOLD,50));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TIC TAC TOE: Let's Play");
        textField.setOpaque(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,650,100);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(50,50,50));

        for(int i=0; i<9; i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setBackground(new Color(55,55,55));
            buttons[i].setFont(new Font("MV boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }
    public void firstTurn(){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        if(random.nextInt(2) == 0){
            player1_turn = true;
            textField.setText("X's Turn");
        }
        else{
            player1_turn = false;
            textField.setText("O's Turn");
        }
    }
    public void check(){
        //Check if X has won
        if(
            (buttons[0].getText() == "X") &&
            (buttons[1].getText() == "X") &&
            (buttons[2].getText() == "X")
        ){
            xWins(0, 1, 2);
        }
        if(
            (buttons[3].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[5].getText() == "X")
        ){
            xWins(3, 4, 5);
        }
        if(
            (buttons[6].getText() == "X") &&
            (buttons[7].getText() == "X") &&
            (buttons[8].getText() == "X")
        ){
            xWins(6, 7, 8);
        }
        if(
            (buttons[0].getText() == "X") &&
            (buttons[3].getText() == "X") &&
            (buttons[6].getText() == "X")
        ){
            xWins(0, 3, 6);
        }
        if(
            (buttons[1].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[7].getText() == "X")
        ){
            xWins(1, 4, 7);
        }
        if(
            (buttons[2].getText() == "X") &&
            (buttons[5].getText() == "X") &&
            (buttons[8].getText() == "X")
        ){
            xWins(2, 5, 8);
        }
        if(
            (buttons[0].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[8].getText() == "X")
        ){
            xWins(0, 4, 8);
        }
        if(
            (buttons[2].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[6].getText() == "X")
        ){
            xWins(2, 4, 6);
        }
        // Check if O wins
        if(
            (buttons[0].getText() == "O") &&
            (buttons[1].getText() == "O") &&
            (buttons[2].getText() == "O")
        ){
            oWins(0, 1, 2);
        }
        if(
            (buttons[3].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[5].getText() == "O")
        ){
            oWins(3, 4, 5);
        }
        if(
            (buttons[6].getText() == "O") &&
            (buttons[7].getText() == "O") &&
            (buttons[8].getText() == "O")
        ){
            oWins(6, 7, 8);
        }
        if(
            (buttons[0].getText() == "O") &&
            (buttons[3].getText() == "O") &&
            (buttons[6].getText() == "O")
        ){
            oWins(0, 3, 6);
        }
        if(
            (buttons[1].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[7].getText() == "O")
        ){
            oWins(1, 4, 7);
        }
        if(
            (buttons[2].getText() == "O") &&
            (buttons[5].getText() == "O") &&
            (buttons[8].getText() == "O")
        ){
            oWins(2, 5, 8);
        }
        if(
            (buttons[0].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[8].getText() == "O")
        ){
            oWins(0, 4, 8);
        }
        if(
            (buttons[2].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[6].getText() == "O")
        ){
            oWins(2, 4, 6);
        }
        //Check to see if the game is a draw
        if(
            (buttons[0].getText() != "") &&
            (buttons[1].getText() != "") &&
            (buttons[2].getText() != "") &&
            (buttons[3].getText() != "") &&
            (buttons[4].getText() != "") &&
            (buttons[5].getText() != "") &&
            (buttons[6].getText() != "") &&
            (buttons[7].getText() != "") &&
            (buttons[8].getText() != "") 
        ){
            draw();
        }
    }
    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        
        for(int i=0; i<9; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("X WINS");
    }
    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        
        for(int i=0; i<9; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("O WINS");
    }
    public void draw(){
        for(int i=0; i<9; i++){
            buttons[i].setBackground(Color.LIGHT_GRAY);
            buttons[i].setEnabled(false);
        }
        textField.setText("GAME DRAW!");
    }

    @Override
    public void actionPerformed(ActionEvent e){
        for(int i=0; i<9; i++){
            if(e.getSource() == buttons[i]){
                if(player1_turn){
                    if(buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(255,255,0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textField.setText("O's Turn");
                        check();
                    }
                }
                else{
                    buttons[i].setForeground(new Color(255,255,255));
                    buttons[i].setText("O");
                    player1_turn = true;
                    textField.setText("X's Turn");
                    check();
                }
            }
        }

    }
}
