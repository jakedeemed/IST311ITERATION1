/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Maxwell Kosabutski
 */
public class Decision2 extends JPanel implements ActionListener{
    private JTextArea j, level2;
    protected JButton choice1, choice2, choice3, choice4;
    static String text = Level2.getLevelDescription();

    
    public Decision2(){
        
    }

    public Decision2(String one, String two, String three, String four)
    {
        level2= new JTextArea(text);
        level2.setEditable(false);
        this.add(level2);
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
    
      public void addBackground(){
        level2= new JTextArea(text);
        level2.setEditable(false);
        this.add(level2);      
  }
    
    public JButton buttonOneClicked(){
     Level2 two = new Level2();
     j.setText(two.getD1());
     this.setBackground(Color.red);
     return choice1;
    }
    
    public JButton buttonTwoClicked(){
     Level2 two = new Level2();
     j.setText(two.getD2());
     this.setBackground(Color.red);
     return choice2;
    }
    
    public JButton buttonThreeClicked(){
     Level2 two = new Level2();
     j.setText(two.getD3());
     this.setBackground(Color.red);
     return choice3;
    }
     
    public JButton buttonFourClicked(){
     Level2 two = new Level2();
     j.setText(two.getD4());
     this.setBackground(Color.green);
     return choice4;
    }
    
    public void buttonRemover(JButton toRemove){
    remove(toRemove);
}
    public void actionPerformed(ActionEvent evt)
    {        
        Object o = evt.getSource();
        
        if (o == choice1) {
      JButton toRemove = buttonOneClicked();
      buttonRemover(toRemove);
        }else if(o == choice2){
      JButton toRemove = buttonTwoClicked();
      buttonRemover(toRemove);
        }else if(o == choice3){
      JButton toRemove = buttonThreeClicked();
      buttonRemover(toRemove);            
        }else if (o == choice4){
      JButton toRemove = buttonFourClicked();
      buttonRemover(toRemove);            
        }
        }
    }

  
    
    
   
    
    

