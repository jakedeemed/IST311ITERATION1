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
public class Level2Test {
    
    public Level2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of backgroundImage method, of class Level2.
     */
    @Test
    public void testBackgroundImage() {
        System.out.println("backgroundImage");
        Level2 instance = new Level2();
        instance.backgroundImage();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLevel method, of class Level2.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        Level2 instance = new Level2();
        int expResult = 1;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLevelDescription method, of class Level2.
     */
    @Test
    public void testGetLevelDescription() {
        System.out.println("getLevelDescription");
        String expResult = "YOU HEAR SHATTERED GLASS, AROUND THE CORNER COMES A BEAR. What will you do?";
        String result = Level2.getLevelDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getD1 method, of class Level2.
     */
    @Test
    public void testGetD1() {
        System.out.println("getD1");
        Level2 instance = new Level2();
        String expResult = "You reach for a knife and the bear "
                + "grabs the knife with his mouth and throws "
                + "it across the room leaving you helpless. Try again.";
        String result = instance.getD1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getD2 method, of class Level2.
     */
    @Test
    public void testGetD2() {
        System.out.println("getD2");
        Level2 instance = new Level2();
        String expResult = "You grab your hunting rifle and try to shoot the bear. "
                + "You then quickly realize that the gun is not loaded. Try again.";
        String result = instance.getD2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getD3 method, of class Level2.
     */
    @Test
    public void testGetD3() {
        System.out.println("getD3");
        Level2 instance = new Level2();
        String expResult = "You try to run out of the room but little did you know "
                + "there is a pack of bears waiting for you outside of the house. Try again.";
        String result = instance.getD3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getD4 method, of class Level2.
     */
    @Test
    public void testGetD4() {
        System.out.println("getD4");
        Level2 instance = new Level2();
        String expResult = "You run and pick up your cat. You show the cat to the bear "
                + "and the bear gives a hug to the cat and then leaves your room.";
        String result = instance.getD4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton1 method, of class Level2.
     */
    @Test
    public void testGetButton1() {
        System.out.println("getButton1");
        Level2 instance = new Level2();
        String expResult = "Knife";
        String result = instance.getButton1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton2 method, of class Level2.
     */
    @Test
    public void testGetButton2() {
        System.out.println("getButton2");
        Level2 instance = new Level2();
        String expResult = "Rifle";
        String result = instance.getButton2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton3 method, of class Level2.
     */
    @Test
    public void testGetButton3() {
        System.out.println("getButton3");
        Level2 instance = new Level2();
        String expResult = "Run";
        String result = instance.getButton3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getButton4 method, of class Level2.
     */
    @Test
    public void testGetButton4() {
        System.out.println("getButton4");
        Level2 instance = new Level2();
        String expResult = "Cat";
        String result = instance.getButton4();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
