package iteration1;


import java.awt.BorderLayout;
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
public class GameUI extends JFrame {
    JPanel firstPanel;
    JFrame firstFrame;
    JLabel firstLabel;
    JPanel levelOnePanel;
    Level1 Level1;
    Level2 Level2;
    
    
    
    public GameUI()
    {
        firstFrame = new JFrame();
        firstPanel = new JPanel();
        firstLabel = new JLabel("WELCOME");
        firstPanel.add(firstLabel);
        firstFrame.getContentPane().add(firstPanel, BorderLayout.CENTER);
        firstFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        firstFrame.setSize(599 ,299);
        firstFrame.setLocationRelativeTo(null);
        firstFrame.setVisible(true);
    }
    
     
    public void repaintLevel1(){
        Level1 = new Level1();
        String one = Level1.getButton1();
        String two = Level1.getButton2();
        String three = Level1.getButton3();
        String four = Level1.getButton4();
        Decision1 panel1 = new Decision1(one,two,three,four);
        firstFrame.setSize(600,300);
        firstFrame.getContentPane().removeAll();
        firstFrame.getContentPane().add(panel1);
        JOptionPane.showMessageDialog(null, "Welcome to the best game ever,"
                + "you are now entering level 1, make your decision carefully!");
        
    }
    
    public void repaintLevel2(){
        Level2 = new Level2();
        String one1 = Level2.getButton1();
        String two1 = Level2.getButton2();
        String three1 = Level2.getButton3();
        String four1 = Level2.getButton4();
        Decision2 panel2 = new Decision2(one1,two1,three1,four1);
        firstFrame.setSize(600,300);
        firstFrame.getContentPane().removeAll();
        firstFrame.getContentPane().add(panel2);
        JOptionPane.showMessageDialog(null, "Welcome to level 2, be wise");
    }
}

