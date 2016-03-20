/*
 * Each ButtonClicked method was calling an instance of level2. I Refactored by adding a level2 instance that applies to the whole class instead
 * of being called for every method. I also organized the actionListeners
 * Refactored by: Edgar J. Cotto
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
public class Decision2 extends JPanel implements ActionListener{
    
    protected JButton choice1, choice2, choice3, choice4;
    protected JLabel levelImg;

    //Level2 Instance
    Level2 two = new Level2();

     public Decision2(){
    }
    
    public Decision2(String one, String two, String three, String four)
    {
        //Creates the Buttons and specific choices for the level. Also adds ActionListeners 
        this.setLayout(new BorderLayout());
        
        addBackground2();
        
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
    
      public void addBackground2(){
        setLayout(new BorderLayout());
        levelImg = new JLabel(new ImageIcon("src/Images/BearCat.PNG"));
        add(levelImg, BorderLayout.CENTER);        
  }
    
    public JButton buttonOneClicked(){
     JOptionPane.showMessageDialog(null, two.getD1()); 
     this.setBackground(Color.red);
     return choice1;
    }
    
    public JButton buttonTwoClicked(){
     JOptionPane.showMessageDialog(null, two.getD2()); 
     this.setBackground(Color.red);
     return choice2;
    }
    
    public JButton buttonThreeClicked(){
     JOptionPane.showMessageDialog(null, two.getD3()); 
     this.setBackground(Color.red);
     return choice3;
    }
     
    public JButton buttonFourClicked(){
     Level2 two = new Level2();
     JOptionPane.showMessageDialog(null, two.getD4()); 
     this.setBackground(Color.green);
     return choice4;
    }
    
    public void buttonRemover(JButton toRemove){
    remove(toRemove);
}
    
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        
      if (o.equals(choice1)) {
      JButton toRemove = buttonOneClicked();
      buttonRemover(toRemove);
      repaint();
        }
      else if(o.equals(choice2)){
      JButton toRemove = buttonTwoClicked();
      buttonRemover(toRemove);
      repaint();
        }
      else if(o.equals(choice3)){
      JButton toRemove = buttonThreeClicked();
      buttonRemover(toRemove);
      repaint();
        }
      else if (o.equals(choice4)){
          JOptionPane.showMessageDialog(null, "Congratulations, you have successfully won"
             + " the Illogical Zombie game!  Check back in a few more weeks for more "
             + "levels.  Thanks for playing!"); 
          System.exit(0);
      
        }
    }
}

  
    
    
   
    
    

