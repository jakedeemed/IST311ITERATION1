/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jakedotts
 */
public class LevelSuper {
    
    private int levelNumber;
    private GameUI game = new GameUI();
    
    public void endGame(){
        System.exit(0);
    }
    public LevelSuper(){
        levelNumber = 0;
    }
    public void setBackgroundImage(String fileName) throws IOException{
        BufferedImage myPicture = ImageIO.read(new File(fileName));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            game.add(picLabel);
    }
    public boolean getPlayerDecision(){
        return false;
    }
    public int getLevelNumber(){
        return levelNumber;
    }
    public void setLevelNumber(int level){
        this.levelNumber = level;
    }
}
