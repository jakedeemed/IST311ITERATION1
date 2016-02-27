/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;


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
        String levelDescription = "YOU HEAR SHATTERED GLASS, AROUND THE CORNER COMES A BEAR. What will you do?";
        return levelDescription;
    }
    public String getD1(){
        String newDecision1 = "You reach for a knife and the bear "
                + "grabs the knife with his mouth and throws "
                + "it across the room leaving you helpless. Try again.";
        return newDecision1;
    }
    public String getD2(){
        String newDecision2 = "You grab your hunting rifle and try to shoot the bear. "
                + "You then quickly realize that the gun is not loaded. Try again.";
        return newDecision2;
    }
    public String getD3(){
        String newDecision3 = "You try to run out of the room but little did you know "
                + "there is a pack of bears waiting for you outside of the house. Try again.";
        return newDecision3;
    }
    public String getD4(){
        String newDecision4 = "You run and pick up your cat. You show the cat to the bear "
                + "and the bear gives a hug to the cat and then leaves your room.";
        return newDecision4;
    }
    public String getButton1(){
        return "Knife";
    }
    public String getButton2(){
        return "Rifle";
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
