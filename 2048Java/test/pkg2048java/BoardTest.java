/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author SuperNova
 */
public class BoardTest {

    public BoardTest() {
    }
    int[][] board, board0, board1;
    int size;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        Board aBoard = new Board();
        board = new int[][]{{1, 2, 3, 4},
        {1, 0, 0, 1},
        {4, 2, 2, 4},
        {0, 0, 0, 0}};
        board0 = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        board1 = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        size = 4;
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

        assertEquals("sub method numbers does not work", 2, numbers(new int[][]{{1, 0}, {0, 1}}));
        org = 2;
        for (int i = 0; i < 10; i++) {
            board = new int[][]{{1, 0}, {0, 1}};
            Board.addRandom(board, nosToAdd);
            res = numbers(board);
            assertEquals("does not add the right amount of numbers", nosToAdd, res - org);
        }
        assertEquals("sets a number to zero", numbers(board1), 16);
    }

    private int numbers(int[][] board) {
        int nums = 0;
        for (int[] board2 : board) {
            for (int j = 0; j < board.length; j++) {
                if (board2[j] != 0) {
                    nums++;
                }
            }
        }
        return nums;
    }

    @Test
    public void testMakeRandomBoard() {
        System.out.println("makeRandomBoard");
        int[][] result = Board.makeRandomBoard(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (result[i][j] != 0 && result[i][j] != 2 && result[i][j] != 4 && result[i][j] != 8) {
                    fail("random board generates a number which is not 0, 2, 4 or 8");
                }
            }
        }
        assertTrue("zero sized boards don't return null", Board.makeRandomBoard(0) == null);
        assertTrue("negative sized boards don't return null", Board.makeRandomBoard(-1) == null);
    }

    private void allZero(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i][j] != 0) {
                    fail("random board of size " + result.length + " generates a number which is not 0 at " + i + ", " + j);
                }
            }
        }
    }

    @Test
    public void testMakeBoard() {
        System.out.println("makeBoard");
        allZero(Board.makeBoard(size));
        allZero(Board.makeBoard(10));
        assertTrue("zero sized boards don't return null", Board.makeBoard(0) == null);
        assertTrue("negative sized boards don't return null", Board.makeBoard(-1) == null);
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

        board = new int[][]{
            {1, 0, 0},
            {0, 2, 0},
            {0, 0, 3}};
        Board.flipBoardLeft(board);
        assertArrayEquals("diagonals remain",
                new int[][]{
                    {1, 0, 0},
                    {0, 2, 0},
                    {0, 0, 3}}, board);

        board = new int[][]{
            {0, 2, 0},
            {1, 0, 0},
            {0, 0, 0}};
        Board.flipBoardLeft(board);
        assertArrayEquals("diagonals remain",
                new int[][]{
                    {0, 1, 0},
                    {2, 0, 0},
                    {0, 0, 0}}, board);
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

    /**
     * Test of addPadding method, of class Board.
     */
    @Test
    public void testAddPadding() {
        System.out.println("addPadding");
        assertEquals(Board.addPadding(0, 0), "0");
        assertEquals(Board.addPadding(1, 1), "1");
        assertEquals(Board.addPadding(-1, 0), "-1");
        assertEquals(Board.addPadding(0, -1), "0");
        assertEquals(Board.addPadding(16, 3), " 16");
        assertEquals(Board.addPadding(8, 3), "  8");
    }

}
