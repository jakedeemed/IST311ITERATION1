/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Maxwell Kosabutski
 */
public class Decision2 extends JPanel implements ActionListener{
    private JTextArea j, level;
    private JButton choice1, choice2, choice3, choice4;
    static String text = Level2.getLevelDescription();

    
    public Decision2(){
        
    }

    public Decision2(String one, String two, String three, String four)
    {
        level= new JTextArea(text);
        level.setEditable(false);
        this.add(level);
        choice1 = new JButton(one);
        this.add(choice1);
        choice2 = new JButton(two);
        this.add(choice2);
        choice3 = new JButton(three);
        this.add(choice3);
        choice4 = new JButton(four);
        this.add(choice4);        
        j = new JTextArea();
        j.setText(text);
        j.setEditable(false);
        this.add(j);
        
        choice1.addActionListener(this);
        choice2.addActionListener(this);
        choice3.addActionListener(this);
        choice4.addActionListener(this);
    }  
    
    public void actionPerformed(ActionEvent evt)
    {
        Level2 two = new Level2();
        
        Object obj = evt.getSource();
        if(obj.equals(choice1)){
            j.setText(two.getD1()); 
            this.setBackground(Color.red);
        }
        else if(obj.equals(choice2)){
            j.setText(two.getD2()); 
            this.setBackground(Color.red);
            
        }
        else if(obj.equals(choice3)){
            j.setText(two.getD3());  
            this.setBackground(Color.red);
        }
        else if(obj.equals(choice4)){
            j.setText(two.getD4());
            this.setBackground(Color.green);
            JOptionPane.showMessageDialog(null, "YOU WON THE GAME");
            System.exit(0);
        }
    }

  
    
    
   
    
    
}
