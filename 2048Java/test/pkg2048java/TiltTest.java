/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2048java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SuperNova
 */
public class TiltTest {
    
    public TiltTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTiltLeft() {
        System.out.println("tiltLeft");
        int[] row = null;
        int[] expResult = null;
        int[] result = Tilt.tiltLeft(row);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTiltRight() {
        System.out.println("tiltRight");
        int[] row = null;
        int[] expResult = null;
        int[] result = Tilt.tiltRight(row);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintRow() {
        System.out.println("printRow");
        int[] row = null;
        Tilt.printRow(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testReverseArray() {
        System.out.println("reverseArray");
        int[] row = null;
        int[] expResult = null;
        int[] result = Tilt.reverseArray(row);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
