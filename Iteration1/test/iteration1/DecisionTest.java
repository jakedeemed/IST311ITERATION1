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
public class DecisionTest {
    
    public DecisionTest() {
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
     * Test of getPlayerOptions method, of class Decision.
     */
    @Test
    public void testGetPlayerOptions() {
        System.out.println("getPlayerOptions");
        Decision instance = new Decision();
        String expResult = "";
        String result = instance.getPlayerOptions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerDecision method, of class Decision.
     */
    @Test
    public void testGetPlayerDecision() {
        System.out.println("getPlayerDecision");
        Decision instance = new Decision();
        String expResult = "";
        String result = instance.getPlayerDecision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerOptions method, of class Decision.
     */
    @Test
    public void testSetPlayerOptions() {
        System.out.println("setPlayerOptions");
        Decision instance = new Decision();
        boolean expResult = false;
        boolean result = instance.setPlayerOptions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerDecisions method, of class Decision.
     */
    @Test
    public void testSetPlayerDecisions() {
        System.out.println("setPlayerDecisions");
        Decision instance = new Decision();
        boolean expResult = false;
        boolean result = instance.setPlayerDecisions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class Decision.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        Decision instance = new Decision();
        instance.setResult();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
