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
        assertEquals("does not say it inserts numbers when it can", true, Board.addRandom(board));
        assertEquals("does not say it inserts numbers when it can", true, Board.addRandom(board0));
        assertEquals("says it inserts numbers when it cant", false, Board.addRandom(board1));
        int[][] board1Org = Board.makeCopy(board1);
        Board.addRandom(board1);
        assertArrayEquals("overwrites number in array", board1, board1Org);
    }

    @Test
    public void testAddRandom_intArrArr_int() {
        System.out.println("addRandom");
        int nosToAdd = 2;
        int org, res;
        assertEquals("sub method numbers does not work", 2, numbers(new int[][]{{1,0},{0,1}}));        
        org = numbers(board);
        Board.addRandom(board, nosToAdd);
        res = numbers(board);
        assertEquals("does not add the right amount of numbers", nosToAdd,res - org);
        org=16;
        assertEquals("sets a number to zero",  numbers(board1),16);
        res = numbers(board1);
    }    

    private int numbers(int[][] board) {
        int nums = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != 0) {
                    nums++;
                }
            }
        }
        return nums;
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
        //Board.printBoard(board2);
        Board.tiltBoardLeft(board);
        //Board.printBoard(board);
        org.junit.Assert.assertArrayEquals("tilt board left", board2, board);
    }

    @Test
    public void testTiltBoardRight() {
        System.out.println("tiltBoardRight");
        int[][] board2 = {{1, 2, 3, 4},
        {0, 0, 0, 2},
        {0, 4, 4, 4},
        {0, 0, 0, 0}};
        //Board.printBoard(board2);
        Board.tiltBoardRight(board);
        //Board.printBoard(board);
        org.junit.Assert.assertArrayEquals("tilt board right", board2, board);
    }
    
    
    @Test
    public void testTiltBoardUp() {
        System.out.println("tiltBoardUp");
        int[][] board2 = {{2, 4, 3, 4},
        {4, 0, 2, 1},
        {0, 0, 0, 4},
        {0, 0, 0, 0}};
        //Board.printBoard(board2);
        Board.tiltBoardUp(board);
        //Board.printBoard(board);
        org.junit.Assert.assertArrayEquals("tilt board up", board2, board);
    }

    @Test
    public void testTiltBoardDown() {
        System.out.println("tiltBoardDown");
        int[][] board2 = {{0, 0, 0, 0},
        {0, 0, 0, 4},
        {2, 0, 3, 1},
        {4, 4, 2, 4}};
        //Board.printBoard(board2);
        Board.tiltBoardDown(board);
        //Board.printBoard(board);
        org.junit.Assert.assertArrayEquals("tilt board down", board2, board);
    }


    @Test
    public void testFlipBoardLeft() {
        System.out.println("flipBoardLeft");
        Board.flipBoardLeft(board);
        //Board.printBoard(board);
        assertArrayEquals("arrays are not being flipped correctly", board, new int[][]{
            {1, 1, 4, 0},
            {2, 0, 2, 0},
            {3, 0, 2, 0},
            {4, 1, 4, 0}});
    }

    @Test
    public void testMakeCopy() {
        System.out.println("makeCopy");
        int[][] copy = Board.makeCopy(board);
        assertArrayEquals(board, copy);
    }

    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        Board.printBoard(board);        
    }
    
}
