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
public class Frame extends JFrame 
{
    public Frame()
    {
       Panel panel1 = new Panel();
    
     getContentPane().add(panel1, BorderLayout.CENTER);
        
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
        
    }
}
