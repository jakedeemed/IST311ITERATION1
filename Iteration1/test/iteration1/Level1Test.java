/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar
 */
public class Level1Test {


    /**
     * Test of backgroundImage method, of class Level1.
     */
    @Test
    public void testBackgroundImage() {
        System.out.println("backgroundImage");
        Level1 instance = new Level1();
        instance.backgroundImage();
        // TODO review the generated test code and remove the default call to fail.
          }

    /**
     * Test of getLevel method, of class Level1.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        Level1 instance = new Level1();
        int expResult = 1;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLevelDescription method, of class Level1.
     */
    /*
    @Test
    
    public void testGetLevelDescription() {
        System.out.println("getLevelDescription");
        String expResult = "It is late at night, you are laying in bed. You then hear a knock on the door and start to wonder who is visiting so late. "
                + "You then hear the door slam open and footsteps running up the staircase."
                + "All of a sudden a zombie busts through your bedroom door. What do you do?";
        String result = Level1.getLevelDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    */

    /**
     * Test of getD1 method, of class Level1.
     */
    @Test
    public void testGetD1() {
        System.out.println("getD1");
        Level1 instance = new Level1();
        String expResult = "You reach for your nearby "
                + "umbrella and try to fend off the zombie. "
                + "The zombie snaps the umbrella into pieces. Try again.";
        String result = instance.getD1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getD2 method, of class Level1.
     */
    @Test
    public void testGetD2() {
        System.out.println("getD2");
        Level1 instance = new Level1();
        String expResult = "The zombie gracefully accepts your "
                + "teddy bear and exits through the window";
        String result = instance.getD2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getD3 method, of class Level1.
     */
    @Test
    public void testGetD3() {
        System.out.println("getD3");
        Level1 instance = new Level1();
        String expResult = "You try to jump out of the window and the zombie "
                + "grabs your legs and pulls you back into your bedroom. Try again.";
        String result = instance.getD3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getD4 method, of class Level1.
     */
    @Test
    public void testGetD4() {
        System.out.println("getD4");
        Level1 instance = new Level1();
        String expResult = "You attempt to fight the zombie and you lose "
                + "the fight. Good try.";
        String result = instance.getD4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton1 method, of class Level1.
     */
    @Test
    public void testGetButton1() {
        System.out.println("getButton1");
        Level1 instance = new Level1();
        String expResult = "Umbrella";
        String result = instance.getButton1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton2 method, of class Level1.
     */
    @Test
    public void testGetButton2() {
        System.out.println("getButton2");
        Level1 instance = new Level1();
        String expResult = "Teddy Bear";
        String result = instance.getButton2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton3 method, of class Level1.
     */
    @Test
    public void testGetButton3() {
        System.out.println("getButton3");
        Level1 instance = new Level1();
        String expResult = "Window";
        String result = instance.getButton3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton4 method, of class Level1.
     */
    @Test
    public void testGetButton4() {
        System.out.println("getButton4");
        Level1 instance = new Level1();
        String expResult = "Fight";
        String result = instance.getButton4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
