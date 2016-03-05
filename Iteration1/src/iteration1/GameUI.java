package iteration1;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vqm5108
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
public class GameUI extends JFrame implements ActionListener{
    JPanel firstPanel;
    JPanel panel;
    JFrame frame;
    JLabel label;
    JButton startButton;
    JFrame firstFrame;
    JLabel firstLabel;
    JPanel levelOnePanel;
    Level1 Level1; 
    Level2 Level2;
    Decision1 Decision1;
    Decision2 Decision2;
    JTextArea gameDescription;
    JTextArea levelDescription;
    ImageIcon gameLogo;
    Timer levelTimer;
    

    
    
    public GameUI()
    {
        initUI();
    }

    
    public void initUI(){
        this.setLayout(new BorderLayout());
        
        frame = new JFrame("The Illogical Zombie");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container mainPane = getContentPane();
        
        JLabel logoButton = new JLabel(new ImageIcon("src/Images/IllogicalZombieLogo.png"));
        
        gameDescription = new JTextArea(5, 20);
        gameDescription.setText("Welcome to 'The Illogical Zombie' your thirty second thrill"
                + " for the day.  The point of this game is to make you think a bit more than"
                + " you usually would about how to escape a threatening situation.  You may find"
                + " that the logical 'right' answer isnt always the 'right' answer.  Look deeply, "
                + "you may soon find your way out");
        JScrollPane scrollPane = new JScrollPane(gameDescription); 
        gameDescription.setEditable(false);
        gameDescription.setLineWrap(true);
        gameDescription.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        
        startButton = new JButton("Start Game");
        startButton.addActionListener(this);
        
        mainPane.add(startButton, BorderLayout.SOUTH);
        mainPane.add(scrollPane, BorderLayout.CENTER);
        mainPane.add(logoButton, BorderLayout.NORTH);
        
        frame.add(mainPane);
        frame.setSize(500, 230);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    

    public void actionPerformed(ActionEvent e){
        Level1 = new Level1();
        Object click = e.getSource();
        if (click.equals(startButton)){
            frame.setVisible(false);
            Level1.initiateLevel();
        }
    }
     
    public void startLevel1(){
        
        Level1 = new Level1();
        Decision1 = new Decision1();
        
        frame.getContentPane().removeAll();
        Container level1Pane = frame.getContentPane();
        
        String one = Level1.getButton1();
        String two = Level1.getButton2();
        String three = Level1.getButton3();
        String four = Level1.getButton4();
        
        Decision1 buttonPanel = new Decision1(one,two,three,four);
        level1Pane.add(buttonPanel);

        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }

    
    public void startLevel2(){
        
        Level2 = new Level2();
        Decision2 = new Decision2();
        
        frame.getContentPane().removeAll();
        Container level2Pane = frame.getContentPane();
        
        String one1 = Level2.getButton1();
        String two1 = Level2.getButton2();
        String three1 = Level2.getButton3();
        String four1 = Level2.getButton4();
        
        Decision2 buttonPanel = new Decision2(one1,two1,three1,four1);
        level2Pane.add(buttonPanel);
        
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

