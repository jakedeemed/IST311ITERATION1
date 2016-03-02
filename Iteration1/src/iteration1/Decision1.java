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
public class Decision1 extends JPanel implements ActionListener{
    private JTextArea j, level;
    protected JButton choice1, choice2, choice3, choice4;
    static String text = Level1.getLevelDescription();
    private GameUI game;

    
    public Decision1(){
        
    }

    public Decision1(String one, String two, String three, String four)
    {
        addBackground();
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
        level= new JTextArea(text);
        level.setEditable(false);
        this.add(level);      
  }
  public JButton buttonOneClicked(){
    Level1 one = new Level1();
    j.setText(one.getD1()); 
    this.setBackground(Color.red);
    return choice1;
  }
 
  public JButton buttonTwoClicked(){
    Level1 one = new Level1();
    j.setText(one.getD2()); 
    this.setBackground(Color.GREEN);
    return choice2;
  }
  public JButton buttonThreeClicked(){
    Level1 one = new Level1();
    j.setText(one.getD3()); 
    this.setBackground(Color.red);
    return choice3;      
  }
  public JButton buttonFourClicked(){
    Level1 one = new Level1();
    j.setText(one.getD4()); 
    this.setBackground(Color.red);
    return choice4;      
  }

public void buttonRemover(JButton toRemove){
    remove(toRemove);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        
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

