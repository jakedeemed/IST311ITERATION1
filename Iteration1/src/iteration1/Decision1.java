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
public class Decision1 extends JPanel implements ActionListener{
    private JTextArea j, level;
    private JButton choice1, choice2, choice3, choice4;
    //Decision decision;
    static String text = Level1.getLevelDescription();
    private Level2 level2 = new Level2();
    private GameUI game = new GameUI();

    
    public Decision1(){
        
    }

    public Decision1(String one, String two, String three, String four)
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
        Level1 one = new Level1();
        
        Object obj = evt.getSource();
        if(obj.equals(choice1)){
            j.setText(one.getD1()); 
            this.setBackground(Color.red);
        }
        else if(obj.equals(choice2)){
            j.setText(one.getD2()); 
            this.setBackground(Color.green);
            JOptionPane.showMessageDialog(null, "you made the right decision");
        }
        else if(obj.equals(choice3)){
            j.setText(one.getD3());  
            this.setBackground(Color.red);
        }
        else if(obj.equals(choice4)){
            j.setText(one.getD4());
            this.setBackground(Color.red);
        }
        
        if(evt.getSource().equals(choice2)){
            Level2 nextLevel = new Level2();
            game.repaint();
        }
    }
    
  
    
    
   
    
    
}
