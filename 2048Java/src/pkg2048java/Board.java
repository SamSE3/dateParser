/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048java;

import com.sun.org.apache.bcel.internal.Constants;

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
        int tot = 0, rtot;
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
        rtot = tot;
        // add numbers in random positions
        while (nosToAdd > 0) {
            int cell = (int) (tot * Math.random());
            int val = 2;
            if (board[x[cell]][y[cell]] == 0) {
                board[x[cell]][y[cell]] = val;
                nosToAdd--;
                rtot--;
                if (rtot == 0) {
                    break;
                }
            }
        }
        // numbers must of been added
        return true;
    }

    public static int[][] makeRandomBoard(int size) {
        int[][] board = makeBoard(size);
        if (board !=null) addRandom(board, 3);
        return board;
    }

    public static int[][] makeBoard(int size) {
        if (size <= 0) {
            System.out.println("null board "+size);
            return null;                        
        }
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
        int[][] copy = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            System.arraycopy(board[i], 0, copy[i], 0, board.length);
        }
        return copy;
    }

    public static void printBoard(int[][] board) {
        int maxLength = 0;
        // get the maximum width of the cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int cellLength = Integer.toString(board[i][j]).length();
                if (cellLength > maxLength) {
                    maxLength = cellLength;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        //add the rows to a string
        for (int i = 0; i < board.length; i++) {
            sb.append('{');
            for (int j = 0; j < board.length - 1; j++) {
                sb.append(addPadding(board[i][j], maxLength));
                // add padding to the string to make all cells of equal size
                sb.append(" ");// always 1 space between cells
            }
            sb.append(addPadding(board[i][board.length - 1], maxLength));
            sb.append("}\n");
        }
        //print it
        System.out.println(sb);
    }

    public static String addPadding(int number, int pad) {
        String str = Integer.toString(number);
        pad -= str.length();
        //enable the following to center the numbers rather than hard left
//        while (pad > pad / 2) {
//            str = " " + str;
//            pad--;
//        }
        String padStr = "";
        while (pad > 0) {
            padStr += " ";
            pad--;
        }
        return (padStr + str);
    }
}
