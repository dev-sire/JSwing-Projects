import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RollingDice extends JFrame {

    public RollingDice(){
        super("Rolling Dice Game In Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        loadGUIComponents();
        this.setVisible(true);
    }
    public void loadGUIComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(0,100,255));
        JLabel bannerImg = ImageService.loadImage("banner.png");
        bannerImg.setBounds(-7, 0, 600, 100);
        panel.add(bannerImg);

        JLabel diceOneImg = ImageService.loadImage("dice1.png");
        diceOneImg.setBounds(50, 150, 200, 200);
        panel.add(diceOneImg);

        JLabel diceTwoImg = ImageService.loadImage("dice1.png");
        diceTwoImg.setBounds(340, 150, 200, 200);
        panel.add(diceTwoImg);

        Random rand = new Random();
        JButton rollButton = new JButton("Roll!");
        rollButton.setBounds(190, 400, 200, 50);
        rollButton.setFocusable(false);
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollButton.setEnabled(false);
                // roll for 3 seconds
                long startTime = System.currentTimeMillis();
                Thread rollThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        long endTime = System.currentTimeMillis();
                        try{
                            while((endTime - startTime)/1000F < 3){
                                // roll dice
                                int diceOne = rand.nextInt(1, 7);
                                int diceTwo = rand.nextInt(1, 7);
                                // update dice images
                                ImageService.updateImage(diceOneImg, "dice" + diceOne + ".png");
                                ImageService.updateImage(diceTwoImg, "dice" + diceTwo + ".png");
                                repaint();
                                revalidate();
                                // sleep thread
                                Thread.sleep(60);
                                endTime = System.currentTimeMillis();
                            }
                            rollButton.setEnabled(true);
                        }catch(InterruptedException e){
                            System.out.println("Threading Error: " + e);
                        }
                    }
                });
                rollThread.start();
            }
        });
        panel.add(rollButton);
        this.getContentPane().add(panel);
    }   
}