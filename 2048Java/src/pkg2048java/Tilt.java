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
public class Tilt {

    public static int[] tiltLeft(int[] row) {
        int lastValIndex = -1;
        boolean lastValCanCombine = true;
        if (row[0] != 0) {
            lastValIndex = 0;
        }
        for (int i = lastValIndex + 1; i < row.length; i++) { //start at the first non-zero value
            if (lastValIndex > -1 && row[i] == row[lastValIndex] && lastValCanCombine) {
                //double value
                row[lastValIndex] *= 2;
                row[i] = 0;
                lastValCanCombine = false;
            } else if (row[i] > 0) {// move value to the left 
                lastValIndex++;
                row[lastValIndex] = row[i];
                if (i != lastValIndex) {
                    row[i] = 0;
                }
                lastValCanCombine = true;
            }
        }
        return row;
    }

    public static int[] tiltRight(int[] row) {
        return null;
    }

    public static void printRow(int[] row) {
    }

    public static int[] reverseArray(int[] row) {
        return null;
    }

}
