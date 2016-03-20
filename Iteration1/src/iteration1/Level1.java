/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Refactoring done by Maxwell Kosabutski, renamed level description string to theSituation and made it final.
 * also instantiated it in the class, not the getter method.
 */
package iteration1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;



/**
 *
 * @author jakedotts
 */

//declare the Strings on the JButtons in the constructor rather than the methods  
//Refactored by: Vincent Maimone
public class Level1 extends JPanel{
    
      
    JTextArea levelDescription;
    String theSituation = "It is late at night, you are laying in bed. You then hear "
                + "a knock on the door and start to wonder who is visiting so late. "
                + "You then hear the door slam open and footsteps running up the staircase."
                + "All of a sudden a zombie busts through your bedroom door. What do you do?";
    String button1 = "Umbrella";
    String button2 = "Teddy Bear";
    String button3 = "Window";
    String button4 = "Fight";
    
    
    public Level1()
    {
        
    }
    
    
    public JScrollPane buildLevelInitiateDescription(){
        
        levelDescription = new JTextArea(5, 20);
        levelDescription.setText(getLevelDescription());
        JScrollPane scrollPane = new JScrollPane(levelDescription); 
        levelDescription.setEditable(false);
        levelDescription.setLineWrap(true);
        levelDescription.setWrapStyleWord(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        
        return scrollPane;
    }
    
    
    
    //moved this method previously the startLevel1 method from the GameUI class
    //to here as the startLevel() method 
    //refactor by Jake Dotts
    public Decision1 startLevel(){
        
        Decision1 buttonPanel = new Decision1(getButton1(),getButton2(),getButton3(),getButton4());

        return buttonPanel;
    }
    
    
    public String getLevelDescription(){

        return theSituation;
    }

    public String getD1(){
        String newDecision1 = "You reach for your nearby "
                + "umbrella and try to fend off the zombie. "
                + "The zombie snaps the umbrella into pieces. Try again.";
                
        return newDecision1;
    }
    public String getD2(){
        String newDecision2 = "The zombie gracefully accepts your "
                + "teddy bear and exits through the window, you have made it out of"
                + "level one, now move on to the next level";
        
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
        return button1;
    }
    public String getButton2(){
        return button2;
    }    
    public String getButton3(){
        return button3;
    }
    public String getButton4(){
        return button4;
    }    

}
