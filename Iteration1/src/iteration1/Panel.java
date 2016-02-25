/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Maxwell Kosabutski
 */
public class Panel extends JFrame{
    private JTextField j;
    private JButton choice1, choice2, choice3, choice4;
    Decision decision;
    static String text = Level1.getLevelDescription();
    


    public Panel(){
    this.getContentPane().setLayout(new FlowLayout());
    
        choice1 = new JButton("choice 1");
        this.add(choice1);
        choice2 = new JButton("choice 2");
        this.add(choice2);
        choice3 = new JButton("choice 3");
        this.add(choice3);
        choice4 = new JButton("choice 4");
        this.add(choice4);        
        j = new JTextField();
        j.setText(text);
        j.setEditable(false);
        this.add(j);
    }  
   
  
    
    
   
    
    
}
