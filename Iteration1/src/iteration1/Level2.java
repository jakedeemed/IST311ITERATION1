/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Refactoring done by Maxwell Kosabutski, magic number/setence refactoring on leveldescription.
 * also instantiated it in the class, not the getter method.
 */
package iteration1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author jakedotts
 */
public class Level2 extends JPanel implements ActionListener{
    
    // Maxwell Kosabutski Refactoring done: Magic number/sentence, I guess. I added the strings for the leveldescriptions and button texts.
    JButton startLevel;
    JTextArea levelDescription;
    Container initiateLevelPane;
    GameUI newUI;
    static String theSituation;
    static String newDecision1;
    static String newDecision2;
    static String newDecision3;
    static String newDecision4;
    static String buttonOneText;
    static String buttonTwoText;
    static String buttonThreeText;
    static String buttonFourText;

    public Level2(){

    }
   
    @Override
    public void actionPerformed(ActionEvent e){
        Object click = e.getSource();
        if (click.equals(startLevel)){
             newUI.startLevel2();
        }
    }
    public void initiateLevel(){
        
        this.setLayout(new BorderLayout());
        
        newUI = new GameUI();
        newUI.frame.getContentPane().removeAll();
        initiateLevelPane = newUI.frame.getContentPane();
        
        levelDescription = new JTextArea(5, 20);
        levelDescription.setText(Level2.getLevelDescription());
        JScrollPane scrollPane = new JScrollPane(levelDescription); 
        levelDescription.setEditable(false);
        levelDescription.setLineWrap(true);
        levelDescription.setWrapStyleWord(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(100, 100));
        
        startLevel = new JButton("Start Level 2");
        startLevel.addActionListener(this);
        
        initiateLevelPane.add(levelDescription, BorderLayout.NORTH);
        initiateLevelPane.add(startLevel, BorderLayout.SOUTH);
        
        
    }
    public static String getLevelDescription(){
        Level2.theSituation = "Congratulations on making it out of Level 1, now you are"
            + "being faced with a new scenario: "
            + "Your sitting quitely in your cabin reading a book by the window,"
            + "and all of the sudden you look up and out of the window.  You see a bear charging "
            + "directly towards your cabin, so you get up and run to another room.  Seconds later"
            + " you hear glass shatter and you are now faced with the bear, what will you do?";
    
        return theSituation;
    }
    public String getD1(){
        newDecision1 = "You reach for a knife and the bear "
                + "grabs the knife with his mouth and throws "
                + "it across the room leaving you helpless. Try again.";
        return newDecision1;
    }
    public String getD2(){
        newDecision2 = "You grab your hunting rifle and try to shoot the bear. "
                + "You then quickly realize that the gun is not loaded. Try again.";
        return newDecision2;
    }
    public String getD3(){
        newDecision3 = "You try to run out of the room but little did you know "
                + "there is a pack of bears waiting for you outside of the house. Try again.";
        return newDecision3;
    }
    public String getD4(){
        newDecision4 = "You run and pick up your cat. You show the cat to the bear "
                + "and the bear gives a hug to the cat and then leaves your room.";
        return newDecision4;
    }
    public String getButton1(){
        buttonOneText = "Knife";
        return buttonOneText;
    }
    public String getButton2(){
        buttonTwoText = "Rifle";
        return buttonTwoText;
    }    
    public String getButton3(){
        buttonThreeText = "Run";
        return buttonThreeText;
    }
    public String getButton4(){
        buttonFourText = "Cat";
        return buttonFourText;
    }    
    
}
