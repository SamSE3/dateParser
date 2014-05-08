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
        org.junit.Assert.assertArrayEquals("empty rows don't stay empty", new int[]{0, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 0, 0, 0}));
        org.junit.Assert.assertArrayEquals("non combinable don't stay the same", new int[]{1, 2, 3, 4}, Tilt.tiltLeft(new int[]{1, 2, 3, 4}));

        org.junit.Assert.assertArrayEquals("does'nt move values left", new int[]{7, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 0, 7, 0}));

        org.junit.Assert.assertArrayEquals("dose'nt combine 1st 2nd elements", new int[]{2, 0, 0, 0}, Tilt.tiltLeft(new int[]{1, 1, 0, 0}));
        org.junit.Assert.assertArrayEquals("dose'nt combine 2nd 3rd elements", new int[]{2, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 1, 1, 0}));
        org.junit.Assert.assertArrayEquals("dose'nt combine 3rd 4th elements", new int[]{2, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 0, 1, 1}));

        org.junit.Assert.assertArrayEquals("dose'nt combine 1st 4th elements", new int[]{2, 0, 0, 0}, Tilt.tiltLeft(new int[]{1, 0, 0, 1}));

        org.junit.Assert.assertArrayEquals("dose'nt combine pairs", new int[]{2, 2, 0, 0}, Tilt.tiltLeft(new int[]{1, 1, 1, 1}));

        org.junit.Assert.assertArrayEquals("dose'nt mix values A", new int[]{1, 4, 1, 0}, Tilt.tiltLeft(new int[]{1, 2, 2, 1}));
        org.junit.Assert.assertArrayEquals("dose'nt mix values B", new int[]{1, 4, 4, 0}, Tilt.tiltLeft(new int[]{1, 4, 2, 2}));
        org.junit.Assert.assertArrayEquals("dose'nt mix values C", new int[]{4, 2, 0, 0}, Tilt.tiltLeft(new int[]{4, 0, 1, 1}));
        org.junit.Assert.assertArrayEquals("dose'nt mix values C", new int[]{2, 2, 0, 0}, Tilt.tiltLeft(new int[]{2, 0, 1, 1}));
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
