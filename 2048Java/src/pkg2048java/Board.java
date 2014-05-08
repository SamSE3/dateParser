/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048java;

/**
 *
 * @author SuperNova
 */
public class Board {

    public static final int MRTA = 1;

    public static boolean addRandom(int[][] board) {
        int nosToAdd = (int) ((MRTA + 1) * Math.random()); //1;//
        return addRandom(board, nosToAdd);
    }

    public static boolean addRandom(int[][] board, int nosToAdd) {
        int[] x = new int[board.length * board.length],
                y = new int[board.length * board.length];
        int tot = 0;
        // find the non zero values
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    x[tot] = i;
                    y[tot] = j;
                    tot++;
                }
            }
        }
        //if cannot add anything return false
        if (tot == 0) {
            return false;
        }
        // add numbers in random positions
        while (nosToAdd > 0) {
            int cell = (int) (tot * Math.random());
            int val = 2;
            board[x[cell]][y[cell]] = val;
            nosToAdd--;
        }
        // numbers must of been added
        return true;
    }

    public static int[][] makeRandomBoard(int size) {
        return null;
    }

    public static int[][] makeBoard(int size) {
        int[][] board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
        return board;
    }

    public static void tiltBoardLeft(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            board[i] = Tilt.tiltLeft(board[i]);
        }
    }

    public static void tiltBoardRight(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            board[i] = Tilt.tiltRight(board[i]);
        }
    }

    public static void tiltBoardDown(int[][] board) {
        flipBoardLeft(board);
        for (int i = 0; i < board.length; i++) {
            board[i] = Tilt.tiltRight(board[i]);
        }
        flipBoardLeft(board);
    }

    public static void tiltBoardUp(int[][] board) {
        flipBoardLeft(board);
        for (int i = 0; i < board.length; i++) {
            board[i] = Tilt.tiltLeft(board[i]);
        }
        flipBoardLeft(board);
    }
    
    public static void flipBoardLeft(int[][] board) {
        int temp;
        for (int i = 0; i < board.length; i++) {
            for (int j = i + 1; j < board.length; j++) {
                temp = board[i][j];
                board[i][j] = board[j][i];
                board[j][i] = temp;
            }
        }        
    }

    public static int[][] makeCopy(int[][] board) {
        return null;
    }

    public static void printBoard(int[][] board) {

    }

    private static String addPadding(int cell, int pad) {
        return null;
    }
}
