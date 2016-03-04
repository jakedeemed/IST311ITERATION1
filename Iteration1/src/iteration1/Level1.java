/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;



/**
 *
 * @author jakedotts
 */
public class Level1 extends JPanel implements ActionListener{
    
      
    JButton levelImg;
    JButton startLevel;
    JTextArea levelDescription;
    GameUI newUI;
    public Level1(){
        
    }
    

    public void endGame(){
        System.exit(0);
    }
    
    public void addBackground1(){

        this.setLayout(new BorderLayout());
        levelImg = new JButton(new ImageIcon("src/Images/zombie.jpg"));
        this.add(levelImg, BorderLayout.CENTER);
  
  }
    public int getLevel(){
        //levelTraverse
        return 1;
    }
    public void actionPerformed(ActionEvent e){
        newUI = new GameUI();
        Object click = e.getSource();
        if (click.equals(startLevel)){
             newUI.startLevel1();
        }
    }
    public void initiatingLevel(){
        
        this.setLayout(new BorderLayout());
        
        newUI = new GameUI();
        newUI.frame.getContentPane().removeAll();
        Container initiateLevelPane = newUI.frame.getContentPane();
        
        levelDescription = new JTextArea(5, 20);
        levelDescription.setText(Level1.getLevelDescription());
        JScrollPane scrollPane = new JScrollPane(levelDescription); 
        levelDescription.setEditable(false);
        levelDescription.setLineWrap(true);
        levelDescription.setWrapStyleWord(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        
        startLevel = new JButton("Start Level 1");
        startLevel.addActionListener(this);
        
        initiateLevelPane.add(levelDescription, BorderLayout.NORTH);
        initiateLevelPane.add(startLevel, BorderLayout.SOUTH);
        
        
    }
    public static String getLevelDescription(){

        String levelDescription = "It is late at night, you are laying in bed. You then hear a knock on the door and start to wonder who is visiting so late. "
                + "You then hear the door slam open and footsteps running up the staircase."
                + "All of a sudden a zombie busts through your bedroom door. What do you do?";
        return levelDescription;
    }

    public String getD1(){
        String newDecision1 = "You reach for your nearby "
                + "umbrella and try to fend off the zombie. "
                + "The zombie snaps the umbrella into pieces. Try again.";
                
        return newDecision1;
    }
    public String getD2(){
        String newDecision2 = "The zombie gracefully accepts your "
                + "teddy bear and exits through the window";
        
        return newDecision2;
    }
    public String getD3(){
        String newDecision3 = "You try to jump out of the window and the zombie "
                + "grabs your legs and pulls you back into your bedroom. Try again.";
                
        return newDecision3;
    }
    public String getD4(){
        String newDecision4 = "You attempt to fight the zombie and you lose "
                + "the fight. Good try.";
                
        return newDecision4;
    }
    
    public String getButton1(){
        return "Umbrella";
    }
    public String getButton2(){
        return "Teddy Bear";
    }    
    public String getButton3(){
        return "Window";
    }
    public String getButton4(){
        return "Fight";
    }    

}
