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
 * @author Vincent
 */
public class LevelSuperTest {
    
    public LevelSuperTest() {
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
     * Test of endGame method, of class LevelSuper.
     */
  

    /**
     * Test of setBackgroundImage method, of class LevelSuper.
     */
 
    

    /**
     * Test of getPlayerDecision method, of class LevelSuper.
     */
    @Test
    public void testGetPlayerDecision() {
        System.out.println("getPlayerDecision");
        LevelSuper instance = new LevelSuper();
        boolean expResult = false;
        boolean result = instance.getPlayerDecision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLevelNumber method, of class LevelSuper.
     */
    @Test
    public void testGetLevelNumber() {
        System.out.println("getLevelNumber");
        LevelSuper instance = new LevelSuper();
        int expResult = 0;
        int result = instance.getLevelNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLevelNumber method, of class LevelSuper.
     */

    
}
