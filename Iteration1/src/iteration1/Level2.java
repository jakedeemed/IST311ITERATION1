/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import javax.swing.JOptionPane;

/**
 *
 * @author jakedotts
 */
public class Level2 extends LevelSuper{
    
    
    private int levelTraverse;
    public Level2(){
        
    }
    

    public void endGame(){
        System.exit(0);
    }
    public void backgroundImage(){
        
    }
    public int getLevel(){
        //levelTraverse
        return 1;
    }
    public static String getLevelDescription(){
        String levelDescription = "YOU HEAR SHATTERED GLASS, AROUND THE CORNER COMES A BEAR";
        return levelDescription;
    }
    public String getD1(){
        String newDecision1 = "You reach for your nearby "
                + "umbrella and try to fend off the zombie. "
                + "The zombie snaps the umbrella into pieces.";
        return newDecision1;
    }
    public String getD2(){
        String newDecision2 = "The zombie gracefully accepts your "
                + "teddy bear and exits through the window";
        return newDecision2;
    }
    public String getD3(){
        String newDecision3 = "You try to jump out of the window and the zombie "
                + "grabs your legs and pulls you back into your bedroom";
        return newDecision3;
    }
    public String getD4(){
        String newDecision4 = "You attempt to fight the zombie and you lose "
                + "the fight. Good try";
        return newDecision4;
    }
    public String getButton1(){
        return "Knife";
    }
    public String getButton2(){
        return "Window";
    }    
    public String getButton3(){
        return "Run";
    }
    public String getButton4(){
        return "Cat";
    }    
    /*
    choice1 = new JButton("Umbrella");
        this.add(choice1);
        choice2 = new JButton("Teddy Bear");
        this.add(choice2);
        choice3 = new JButton("Window");
        this.add(choice3);
        choice4 = new JButton("Fight");
    
    
    
    j.setText("You reach for your nearby umbrella and try to fend off the zombie. The zombie snaps the umbrella into pieces.");      
        }
        if(obj.equals(choice2))
        {
            j.setText("The zombie gracefully accepts your teddy bear and exits through the window");
            
        }
        
        if(obj.equals(choice3))
        {
            j.setText("You try to jump out of the window and the zombie grabs your legs and pulls you back into your bedroom.");
            
        }
        
        if(obj.equals(choice4))
        {
            j.setText("You attempt to fight the zombie and you lose the fight. Good try");
        }
    
    */
}
