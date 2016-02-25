/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;



import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Edgar
 */
public class Decision extends DecisionsSuperClass{
    //Option Buttons
    String teddyBear = "Teddy Bear!";                   String run = "Run!";
    String windowJump = "Jump out the window!";         String fightZoombie = "Fight the Zoombie!";
    
    public Decision(){
        
    }
    
    //Sends Player Options to the Level Class
    public String getPlayerOptions(){
       return teddyBear + windowJump + run + fightZoombie;
    }
    
    public String getPlayerDecision(){
        return "";
    }
    
    public void setPlayerOptions(Button DecisionOne,String tb, String wj, String r, String fz){
       this.teddyBear = tb;
       windowJump = wj;
       run = r;
       fightZoombie = fz;
       
       
    }
    
       
  //  public void setPlayerDecisions(){
            
   // }
    
    public void setResult(){
    
    }

    boolean setPlayerOptions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
    
    
    
    
    
    
    
    
    
    
}
