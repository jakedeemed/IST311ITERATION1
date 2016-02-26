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
public class Panel extends JPanel implements ActionListener{
    private JTextField j;
    private JButton choice1, choice2, choice3, choice4;
    Decision decision;
    static String text = Level1.getLevelDescription();
    
    public Panel(){
        
    }

    public Panel(String one, String two, String three, String four)
    {
    
        choice1 = new JButton(one);
        this.add(choice1);
        choice2 = new JButton(two);
        this.add(choice2);
        choice3 = new JButton(three);
        this.add(choice3);
        choice4 = new JButton(four);
        this.add(choice4);        
        j = new JTextField();
        j.setText(text);
        j.setEditable(true);
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
        }
        else if(obj.equals(choice2)){
            j.setText(one.getD2());  
        }
        else if(obj.equals(choice3)){
            j.setText(one.getD3());    
        }
        else if(obj.equals(choice4)){
            j.setText(one.getD4());
        }
    }
   
  
    
    
   
    
    
}
