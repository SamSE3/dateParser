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
        org.junit.Assert.assertArrayEquals("dose'nt mix values A", new int[]{0, 1, 4, 1}, Tilt.tiltRight(new int[]{1, 2, 2, 1}));
        org.junit.Assert.assertArrayEquals("dose'nt mix values B", new int[]{0, 1, 4, 4}, Tilt.tiltRight(new int[]{1, 4, 2, 2}));
        org.junit.Assert.assertArrayEquals("dose'nt mix values C", new int[]{0, 0, 4, 2}, Tilt.tiltRight(new int[]{4, 0, 1, 1}));
        org.junit.Assert.assertArrayEquals("dose'nt mix values C", new int[]{0, 0, 2, 2}, Tilt.tiltRight(new int[]{2, 0, 1, 1}));
    }

    @Test
    public void testReverseArray() {
        org.junit.Assert.assertArrayEquals("array does not reverse correctly", new int[]{1, 2, 3, 4}, Tilt.reverseArray(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void testPrintRow() {
        System.out.println("printRow");
        int[] row = null;
        Tilt.printRow(new int[]{0, 1, 4, 1});
    }
    
}
