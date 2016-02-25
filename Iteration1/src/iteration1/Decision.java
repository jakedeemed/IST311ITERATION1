/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public abstract class Decision implements ActionListener{ 
    JButton DecisionOne = new JButton("");
    JButton DecisionTwo;
    JButton DecisionThree;
    JButton DecisionFour;
    
    public Decision(){
      DecisionOne.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
          JTextField d = new JTextField("YOU LOSE!");
         }
     });
      
      DecisionTwo.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
          JTextField d = new JTextField("YOU LOSE!");
         }
     });
     
       DecisionThree.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
          JTextField d = new JTextField("YOU LOSE!");
         }
     });
       
        DecisionFour.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
          JTextField d = new JTextField("");
         }
     });
      
     }

    public void setButtons(JButton a, JButton b, JButton c,JButton d){
        DecisionOne = a;
        DecisionTwo =b; 
        DecisionThree =c;
        DecisionFour = d;
                
    }

     
}
    
    
    
