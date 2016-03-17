/*
 * Each ButtonClicked method was calling an instance of level1. I Refactored by adding a level1 instance that applies to the whole class instead
 * of being called for every method. I also organized the actionListeners
 *Refactored by: Edgar J. Cotto
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
    
    protected JButton choice1, choice2, choice3, choice4, rightChoice;
    protected JLabel levelImg;

    //Instance of level1
    Level1 one = new Level1();

    public Decision1(){
    }
    
    public Decision1(String one, String two, String three, String four)
    {
        //Creates the Buttons and specific choices for the level. Also adds ActionListeners 
        this.setLayout(new BorderLayout());
        
        addBackground1();
        
        choice1 = new JButton(one);
        this.add(choice1, BorderLayout.NORTH);
        choice1.addActionListener(this);

        
        choice2 = new JButton(two);
        this.add(choice2, BorderLayout.WEST);
        choice2.addActionListener(this);


        choice3 = new JButton(three);
        this.add(choice3, BorderLayout.EAST);
        choice3.addActionListener(this);


        choice4 = new JButton(four);
        this.add(choice4, BorderLayout.SOUTH);
        choice4.addActionListener(this);

         
       
    }
    
  public void addBackground1(){
        setLayout(new BorderLayout());
        levelImg = new JLabel(new ImageIcon("src/Images/ZombieTeddy.PNG"));
        add(levelImg, BorderLayout.CENTER);   
  }

  public JButton buttonOneClicked(){
    JOptionPane.showMessageDialog(null, one.getD1()); 
    this.setBackground(Color.red);
    return choice1;
  }
 
  public JButton buttonTwoClicked(){
    return choice2;
  }
  
  public JButton buttonThreeClicked(){
    JOptionPane.showMessageDialog(null, one.getD3()); 
    this.setBackground(Color.red);
    return choice3;      
  }
  
  public JButton buttonFourClicked(){
    JOptionPane.showMessageDialog(null, one.getD4()); 
    this.setBackground(Color.red);
    return choice4;      
  }

public void buttonRemover(JButton toRemove){
    remove(toRemove);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        rightChoice = new JButton();
        Object o = ae.getSource();
        
        if (o.equals(choice1)) {
      JButton toRemove = buttonOneClicked();
      buttonRemover(toRemove);
      repaint();
  
        }else if(o.equals(choice2)){
            
        this.setVisible(false);
        Level2 initLevel = new Level2();
        initLevel.initiateLevel();
        repaint();
        
        }else if(o.equals(choice3)){
        JButton toRemove = buttonThreeClicked();
        buttonRemover(toRemove);
        repaint();
      
        }else if (o.equals(choice4)){
      JButton toRemove = buttonFourClicked();
      buttonRemover(toRemove);
      repaint();
        }
    }

      
    
   
    
    
}

