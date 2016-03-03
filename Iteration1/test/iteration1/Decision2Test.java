/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteration1;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
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
public class Decision2Test {
    
    public Decision2Test() {
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
     * Test of buttonOneClicked method, of class Decision2.
     */
    @Test
    public void testButtonOneClicked() {
        System.out.println("buttonOneClicked");
        Decision2 instance = new Decision2();
        JButton expResult = instance.choice1;
        JButton result = instance.choice1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buttonTwoClicked method, of class Decision2.
     */
    @Test
    public void testButtonTwoClicked() {
        System.out.println("buttonTwoClicked");
        Decision2 instance = new Decision2();
        JButton expResult = instance.choice2;
        JButton result = instance.choice2;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buttonThreeClicked method, of class Decision2.
     */
    @Test
    public void testButtonThreeClicked() {
        System.out.println("buttonThreeClicked");
        Decision2 instance = new Decision2();
        JButton expResult = instance.choice3;
        JButton result = instance.choice3;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buttonFourClicked method, of class Decision2.
     */
    @Test
    public void testButtonFourClicked() {
        System.out.println("buttonFourClicked");
        Decision2 instance = new Decision2();
        JButton expResult = instance.choice4;
        JButton result = instance.choice4;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
