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
import javax.swing.JPanel;
public class GameUI extends JFrame {
    Level1 Level1 = new Level1();
    Level2 Level2 = new Level2();
    private String one = Level1.getButton1();
    private String two = Level1.getButton2();
    private String three = Level1.getButton3();
    private String four = Level1.getButton4();
    
    private String one1 = Level2.getButton1();
    private String two1 = Level2.getButton2();
    private String three1 = Level2.getButton3();
    private String four1 = Level2.getButton4();
    public GameUI()
    {
       Decision1 panel1 = new Decision1(one,two,three,four);
       getContentPane().add(panel1, BorderLayout.CENTER);
        
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650,650);
        setVisible(true);
    }
    
     

    
    public void repaintLevel2(){
    Decision2 panel2 = new Decision2(one1,two1,three1,four1);
    
    }
}

