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
 * @author jakedotts
 */
public class LevelTest {
    
    public LevelTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of endGame method, of class Level.
     */
    @Test
    
    public void testEndGame() {
        System.out.println("endGame");
        Level instance = new Level();
        instance.endGame();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of backgroundImage method, of class Level.
     */
    @Test
    public void testBackgroundImage() {
        System.out.println("backgroundImage");
        Level instance = new Level();
        instance.backgroundImage();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerDecision method, of class Level.
     */
    @Test
    public void testGetPlayerDecision() {
        System.out.println("getPlayerDecision");
        Level instance = new Level();
        boolean expResult = true;
        boolean result = instance.getPlayerDecision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class Level.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        Level instance = new Level();
        int expResult = 1;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
