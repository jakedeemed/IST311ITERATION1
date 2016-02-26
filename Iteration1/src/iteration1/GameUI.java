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
    private String one = Level1.getButton1();
    private String two = Level1.getButton2();
    private String three = Level1.getButton3();
    private String four = Level1.getButton4();
    public GameUI()
    {
       getContentPane().add(panel1, BorderLayout.CENTER);
        
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650,650);
        setVisible(true);
    }
    
     
        Decision1 panel1 = new Decision1(one,two,three,four);
    }
}
