package iteration1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vincent
 */

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Images extends JPanel
{
    
    JButton level1;
    JButton level2;
    
    
    Images()
    {
       
    }
    
    
    public void mainscreenimage()
    {
        
    }
    
    public void level1image()
    {
       setLayout(new BorderLayout());
       level1 = new JButton(new ImageIcon("src/Images/zombie.jpg"));
       add(level1, BorderLayout.WEST);
       
       
    }
    
    public void level2image()
    {
        setLayout(new BorderLayout());
        level2 = new JButton(new ImageIcon("src/Images/bear.jpg"));
        add(level2, BorderLayout.SOUTH);
    }
    
}
