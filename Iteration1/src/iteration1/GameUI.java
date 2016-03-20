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
    
    
    Level1 Level1 = new Level1();
    Level2 Level2 = new Level2();
    JFrame frame;   
    JTextArea gameDescription;
    JScrollPane buildLevelInitiateDesc;
    Container mainPane;
    JPanel parentPanel, startPanel, initL1Panel, initL2Panel, buildL1Panel, buildL2Panel;
    JButton startButton, nextL1, nextL2, startLevel1, startLevel2;
    
    
    
    
    public GameUI()
    {
        initUI();
    }

    //added panels to build on top of the frame for more modularity through
    //the rest of the program
    //refactor: Jake Dotts
    public void initUI(){
        
        frame = new JFrame("The Illogical Zombie");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        parentPanel = new JPanel();
        
        startPanel = new JPanel();
        startPanel.setLayout(new BorderLayout());
        startPanel.setPreferredSize(new Dimension(500, 400));   
        
        JLabel logoButton = new JLabel(new ImageIcon("src/Images/IllogicalZombieLogo.png"));
        
        startButton = new JButton("Start Game");
        startButton.addActionListener(this);
        
        startPanel.add(startButton, BorderLayout.SOUTH);
        startPanel.add(initUIScrollPane(), BorderLayout.CENTER);
        startPanel.add(logoButton, BorderLayout.NORTH);
        
        parentPanel.add(startPanel);
        
        frame.add(parentPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public JScrollPane initUIScrollPane(){
        
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
        
        return scrollPane;
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        Object click = e.getSource();
        
        if (click.equals(startButton)){  
            initLevel1();
        }
        
        if (click.equals(startLevel1)){ 
            buildLevel1();
        }
        
        if (click.equals(nextL1)){    
            initLevel2();
        }
        
        if (click.equals(startLevel2)){
            buildLevel2();
        }
        
        if (click.equals(nextL2)){
            System.exit(0);
        }
        
    }
    
    //added the init and build methods to make the program more modular
    //when working with the panels
    //refactor: Jake Dotts
     
    //added: J.D.
    public void initLevel1(){
        
        parentPanel.remove(startPanel);
        
        initL1Panel = new JPanel();
        initL1Panel.setLayout(new BorderLayout());
        initL1Panel.setPreferredSize(new Dimension(500, 400));
        
        buildLevelInitiateDesc = Level1.buildLevelInitiateDescription();
        
        startLevel1 = new JButton("Start Level 1");
        startLevel1.addActionListener(this);
        
        initL1Panel.add(buildLevelInitiateDesc, BorderLayout.NORTH);
        initL1Panel.add(startLevel1, BorderLayout.SOUTH);
        
        parentPanel.add(initL1Panel);
        parentPanel.revalidate();
        parentPanel.repaint();
        pack();

        
        
    }
    
    //added: J.D.
    public void buildLevel1(){
        
        nextL1 = new JButton("> Next Level >");
        nextL1.addActionListener(this);
        
        parentPanel.remove(initL1Panel);
        
        buildL1Panel = new JPanel();
        buildL1Panel.setPreferredSize(new Dimension(500, 400));
        buildL1Panel.add(Level1.startLevel());
        
        buildL1Panel.add(nextL1);
        
        parentPanel.add(buildL1Panel);
        parentPanel.revalidate();
        parentPanel.repaint();
        pack();
        
    }
    
    //added: J.D.
    public void initLevel2(){
        
        parentPanel.remove(buildL1Panel);
        
        initL2Panel = new JPanel();
        initL2Panel.setLayout(new BorderLayout());
        initL2Panel.setPreferredSize(new Dimension(500, 400));
        
        buildLevelInitiateDesc = Level2.buildLevelInitiateDescription();
        
        startLevel2 = new JButton("Start Level 2");
        startLevel2.addActionListener(this);
        
        initL2Panel.add(buildLevelInitiateDesc, BorderLayout.NORTH);
        initL2Panel.add(startLevel2, BorderLayout.SOUTH);
        
        parentPanel.add(initL2Panel);
        parentPanel.revalidate();
        parentPanel.repaint();
        pack();
        
        
        
    }
    
    //added: J.D.
    public void buildLevel2(){
        
        nextL2 = new JButton("~ END GAME ~");
        nextL2.addActionListener(this);
        
        parentPanel.remove(initL2Panel);
        
        buildL2Panel = new JPanel();
        buildL2Panel.setPreferredSize(new Dimension(500, 400)); 
        buildL2Panel.add(Level2.startLevel());
        
        buildL2Panel.add(nextL2);
        
        parentPanel.add(buildL2Panel);
        parentPanel.revalidate();
        parentPanel.repaint();
        pack();
    }
    
}

