/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Maxwell Kosabutski
 */
public class Decision1 extends JPanel implements ActionListener{
    
    protected JButton choice1, choice2, choice3, choice4;
    protected JLabel levelImg;

    
    public Decision1(){
        
    }

    public Decision1(String one, String two, String three, String four)
    {
        
        this.setLayout(new BorderLayout());
        
        addBackground1();
        
        choice1 = new JButton(one);
        this.add(choice1, BorderLayout.NORTH);
        
        choice2 = new JButton(two);
        this.add(choice2, BorderLayout.WEST);

        choice3 = new JButton(three);
        this.add(choice3, BorderLayout.EAST);

        choice4 = new JButton(four);
        this.add(choice4, BorderLayout.SOUTH);
        
           choice1.addActionListener(this);
           choice2.addActionListener(this);
           choice3.addActionListener(this);
           choice4.addActionListener(this);
       
    }
    
  public void addBackground1(){
        setLayout(new BorderLayout());
        levelImg = new JLabel(new ImageIcon("src/Images/zombie.jpg"));
        add(levelImg, BorderLayout.CENTER);   
  }

  public JButton buttonOneClicked(){
    Level1 one = new Level1();
    JOptionPane.showMessageDialog(null, one.getD1()); 
    this.setBackground(Color.red);
    return choice1;
  }
 
  public JButton buttonTwoClicked(){
    Level1 one = new Level1();
    JOptionPane.showMessageDialog(null, one.getD2()); 
    this.setBackground(Color.GREEN);
    return choice2;
  }
  
  public JButton buttonThreeClicked(){
    Level1 one = new Level1();
    JOptionPane.showMessageDialog(null, one.getD3()); 
    this.setBackground(Color.red);
    return choice3;      
  }
  
  public JButton buttonFourClicked(){
    Level1 one = new Level1();
    JOptionPane.showMessageDialog(null, one.getD4()); 
    this.setBackground(Color.red);
    return choice4;      
  }

public void buttonRemover(JButton toRemove){
    remove(toRemove);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        Level2 nextLevel = new Level2();
        Object o = ae.getSource();
        
        if (o.equals(choice1)) {
      JButton toRemove = buttonOneClicked();
      buttonRemover(toRemove);
        }else if(o.equals(choice2)){
      JButton toRemove = buttonTwoClicked();
      buttonRemover(toRemove);
        nextLevel.initiatingLevel();
        }else if(o.equals(choice3)){
      JButton toRemove = buttonThreeClicked();
      buttonRemover(toRemove);            
        }else if (o.equals(choice4)){
      JButton toRemove = buttonFourClicked();
      buttonRemover(toRemove);            
        }
    }

      
    
   
    
    
}

