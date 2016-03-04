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
public class GameUITest {
    
    public GameUITest() {
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
     * Test of startLevel1 method, of class GameUI.
     */
    @Test
    public void testRepaintLevel1() {
        System.out.println("repaintLevel1");
        GameUI instance = new GameUI();
        instance.startLevel1();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of startLevel2 method, of class GameUI.
     */
    @Test
    public void testRepaintLevel2() {
        System.out.println("repaintLevel2");
        GameUI instance = new GameUI();
        instance.startLevel2();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
