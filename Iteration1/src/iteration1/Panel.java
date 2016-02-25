/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Edgar
 */
public class Panel extends JFrame{
    
    public Panel(){
    this.getContentPane().setLayout(new FlowLayout());
    DecisionsSuperClass s = new DecisionsSuperClass();
    add(s.DecisionOne);
    add(s.decisionTwo);
    add(s.decisionThree);
    add(s.decisionFour);
   
    s.DecisionOne.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
         JTextField d = new JTextField("YOU LOSE!");
        }
    });
    }
    
    
   
    
    
}
