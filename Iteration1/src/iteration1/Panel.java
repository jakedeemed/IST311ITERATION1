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
    


    public Panel()
    {
    
        choice1 = new JButton("Umbrella");
        this.add(choice1);
        choice2 = new JButton("Teddy Bear");
        this.add(choice2);
        choice3 = new JButton("Window");
        this.add(choice3);
        choice4 = new JButton("Fight");
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
        Object obj = evt.getSource();
        if(obj == choice1)
        {
            j.setText("You reach for your nearby umbrella and try to fend off the zombie. The zombie snaps the umbrella into pieces.");
            
        }
        
        if(obj == choice2)
        {
            j.setText("The zombie gracefully accepts your teddy bear and exits through the window");
            
        }
        
        if(obj == choice3)
        {
            j.setText("You try to jump out of the window and the zombie grabs your legs and pulls you back into your bedroom.");
            
        }
        
        if(obj == choice4)
        {
            j.setText("You attempt to fight the zombie and you lose the fight. Good try");
        }
    }
   
  
    
    
   
    
    
}
