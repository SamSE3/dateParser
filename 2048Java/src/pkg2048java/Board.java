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
        return false;
    }

    public static int[][] makeRandomBoard(int size) {
        return null;
    }

    public static int[][] makeBoard(int size) {
        int[][] board = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j]=0;                
            }            
        }
        return board;
    }

    public static void tiltBoardLeft(int[][] board) {
    }

    public static void tiltBoardRight(int[][] board) {
    }

    public static void tiltBoardDown(int[][] board) {
    }

    public static void tiltBoardUp(int[][] board) {
    }

    public static void flipBoardLeft(int[][] board) {
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
