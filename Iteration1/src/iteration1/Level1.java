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
public class Level1 extends LevelSuper{
    
    private int levelTraverse;
    private static String levelDescription = "IT IS DARK, YOU ARE LIKELY TO BE EATEN BY A GRUE";
    
    public Level1(boolean decision){
        decision = super.getPlayerDecision();
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
        return Level1.levelDescription;
    }
}
