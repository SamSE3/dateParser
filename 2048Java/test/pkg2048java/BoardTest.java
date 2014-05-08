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
public class BoardTest {
    
    public BoardTest() {
    }
    int[][] board, board0, board1;
    int size;

    @Before
    public void setUp() {
        board = new int[][]{{1, 2, 3, 4},
        {1, 0, 0, 1},
        {4, 2, 2, 4},
        {0, 0, 0, 0}};
        board0 = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        board1 = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        //size = 4;
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddRandom_intArrArr() {
        System.out.println("addRandom");
        int[][] board = null;
        boolean expResult = false;
        boolean result = Board.addRandom(board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddRandom_intArrArr_int() {
        System.out.println("addRandom");
        int[][] board = null;
        int nosToAdd = 0;
        boolean expResult = false;
        boolean result = Board.addRandom(board, nosToAdd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMakeRandomBoard() {
        System.out.println("makeRandomBoard");
        int size = 0;
        int[][] expResult = null;
        int[][] result = Board.makeRandomBoard(size);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMakeBoard() {
        System.out.println("makeBoard");
        int size = 0;
        int[][] expResult = null;
        int[][] result = Board.makeBoard(size);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTiltBoardLeft() {
        System.out.println("tiltBoardLeft");
        int[][] board2 = {{1, 2, 3, 4},
        {2, 0, 0, 0},
        {4, 4, 4, 0},
        {0, 0, 0, 0}};
        //Board.printBoardSimple(board2);
        Board.tiltBoardLeft(board);
        //Board.printBoardSimple(board);
        org.junit.Assert.assertArrayEquals("tilt board left", board2, board);
    }

    @Test
    public void testTiltBoardRight() {
        System.out.println("tiltBoardRight");
        int[][] board2 = {{1, 2, 3, 4},
        {0, 0, 0, 2},
        {0, 4, 4, 4},
        {0, 0, 0, 0}};
        //Board.printBoardSimple(board2);
        Board.tiltBoardRight(board);
        //Board.printBoardSimple(board);
        org.junit.Assert.assertArrayEquals("tilt board right", board2, board);
    }
    
    @Test
    public void testTiltBoardDown() {
        System.out.println("tiltBoardDown");
        int[][] board = null;
        Board.tiltBoardDown(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTiltBoardUp() {
        System.out.println("tiltBoardUp");
        int[][] board = null;
        Board.tiltBoardUp(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testFlipBoardLeft() {
        System.out.println("flipBoardLeft");
        int[][] board = null;
        Board.flipBoardLeft(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMakeCopy() {
        System.out.println("makeCopy");
        int[][] board = null;
        int[][] expResult = null;
        int[][] result = Board.makeCopy(board);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        int[][] board = null;
        Board.printBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
