/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

        org.junit.Assert.assertArrayEquals("doesn't move values left", new int[]{7, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 0, 7, 0}));

        org.junit.Assert.assertArrayEquals("doesn't combine 1st 2nd elements", new int[]{2, 0, 0, 0}, Tilt.tiltLeft(new int[]{1, 1, 0, 0}));
        org.junit.Assert.assertArrayEquals("doesn't combine 2nd 3rd elements", new int[]{2, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 1, 1, 0}));
        org.junit.Assert.assertArrayEquals("doesn't combine 3rd 4th elements", new int[]{2, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 0, 1, 1}));

        org.junit.Assert.assertArrayEquals("doesn't combine elements seperated by 0s", new int[]{16, 0, 0, 0}, Tilt.tiltLeft(new int[]{8, 0, 0, 8}));

        org.junit.Assert.assertArrayEquals("doesn't double combine", new int[]{14, 14, 0, 0}, Tilt.tiltLeft(new int[]{7, 7, 14, 0}));

        org.junit.Assert.assertArrayEquals("doesn't combine pairs", new int[]{2, 2, 0, 0}, Tilt.tiltLeft(new int[]{1, 1, 1, 1}));

        org.junit.Assert.assertArrayEquals("doesn't mix values A", new int[]{1, 4, 1, 0}, Tilt.tiltLeft(new int[]{1, 2, 2, 1}));
        org.junit.Assert.assertArrayEquals("doesn't mix values B", new int[]{1, 4, 4, 0}, Tilt.tiltLeft(new int[]{1, 4, 2, 2}));
        org.junit.Assert.assertArrayEquals("doesn't mix values C", new int[]{4, 2, 0, 0}, Tilt.tiltLeft(new int[]{4, 0, 1, 1}));
        org.junit.Assert.assertArrayEquals("doesn't mix values D", new int[]{2, 2, 0, 0}, Tilt.tiltLeft(new int[]{2, 0, 1, 1}));

        // white box tests
        org.junit.Assert.assertArrayEquals("empty row dosen't returns an empty row", new int[]{}, Tilt.tiltLeft(new int[]{}));
        org.junit.Assert.assertArrayEquals("doesn't mix far right values", new int[]{1, 8, 3, 6, 7, 4, 0}, Tilt.tiltLeft(new int[]{1, 8, 3, 6, 7, 2, 2}));
        org.junit.Assert.assertArrayEquals("doesn't mix far left values", new int[]{2, 8, 3, 6, 7, 2, 0}, Tilt.tiltLeft(new int[]{1, 1, 8, 3, 6, 7, 2}));
        org.junit.Assert.assertArrayEquals("dosen't move far right values left", new int[]{9, 0, 0, 0, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 0, 0, 0, 0, 0, 9}));
        org.junit.Assert.assertArrayEquals("first value 0", new int[]{1, 2, 3, 4, 5, 6, 0}, Tilt.tiltLeft(new int[]{0, 1, 2, 3, 4, 5, 6}));
        org.junit.Assert.assertArrayEquals("second value 0", new int[]{1, 2, 3, 4, 5, 6, 0}, Tilt.tiltLeft(new int[]{1, 0, 2, 3, 4, 5, 6}));
        org.junit.Assert.assertArrayEquals("first and second values 0", new int[]{4, 4, 5, 6, 0, 0, 0}, Tilt.tiltLeft(new int[]{0, 0, 2, 2, 4, 5, 6}));        
        org.junit.Assert.assertArrayEquals("dosent move and combine alternating values", new int[]{4, 4, 0, 0, 0, 0, 0}, Tilt.tiltLeft(new int[]{2, 0, 2, 0, 2, 0, 2}));
        
        

    }

    @Test
    public void testTiltRight() {
        org.junit.Assert.assertArrayEquals("doesn't mix values A", new int[]{0, 1, 4, 1}, Tilt.tiltRight(new int[]{1, 2, 2, 1}));
        org.junit.Assert.assertArrayEquals("doesn't mix values B", new int[]{0, 1, 4, 4}, Tilt.tiltRight(new int[]{1, 4, 2, 2}));
        org.junit.Assert.assertArrayEquals("doesn't mix values C", new int[]{0, 0, 4, 2}, Tilt.tiltRight(new int[]{4, 0, 1, 1}));
        org.junit.Assert.assertArrayEquals("doesn't mix values D", new int[]{0, 0, 2, 2}, Tilt.tiltRight(new int[]{2, 0, 1, 1}));
    }

    @Test
    public void testReverseArray() {
        org.junit.Assert.assertArrayEquals("array does not reverse correctly", new int[]{1, 2, 3, 4}, Tilt.reverseArray(new int[]{4, 3, 2, 1}));
        org.junit.Assert.assertArrayEquals("array does not reverse correctly", new int[]{1, 2, 3, 4, 9, 7, 8}, Tilt.reverseArray(new int[]{8, 7, 9, 4, 3, 2, 1}));
        
        org.junit.Assert.assertArrayEquals("array does not reverse correctly", new int[]{0, 0, 0, 0, 0, 0, 8}, Tilt.reverseArray(new int[]{8, 0, 0, 0, 0, 0, 0}));
        org.junit.Assert.assertArrayEquals("array does not reverse correctly", new int[]{1232, 0, 0, 0, 0, 0, 0}, Tilt.reverseArray(new int[]{0, 0, 0, 0, 0, 0, 1232}));
    }

    @Test
    public void testPrintRow() {
        System.out.println("printRow");
        //int[] row = null;
        Tilt.printRow(new int[]{0, 1, 4, 1});
    }

}
