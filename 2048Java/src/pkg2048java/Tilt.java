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
        if (row.length == 0) {
            return row;
        }
        int lastValIndex = -1;
        boolean lastValCanCombine = true;
        if (row[0] != 0) {
            lastValIndex = 0;
        }
        for (int i = lastValIndex + 1; i < row.length; i++) { //start at the first non-zero value + 1
            if (lastValIndex > -1 && row[i] == row[lastValIndex] && lastValCanCombine) {
                // merge and double values
                row[lastValIndex] *= 2;
                row[i] = 0;
                lastValCanCombine = false;
            } else if (row[i] > 0) {
                // move value to the left 
                lastValIndex++;
                row[lastValIndex] = row[i];
                if (i != lastValIndex) {
                    row[i] = 0;
                }
                lastValCanCombine = true;
            }
            //System.out.println(i);
        }
        return row;
    }

    public static int[] tiltRight(int[] row) {
        int lastValIndex = row.length;
        boolean lastValCanCombine = true;
        if (row[row.length - 1] != 0) {
            lastValIndex = row.length - 1;
        }
        for (int i = lastValIndex - 1; i > -1; i--) {
            //start at the first non-zero value
            if (lastValIndex < row.length && row[i] == row[lastValIndex] && lastValCanCombine) {
                //double value
                row[lastValIndex] *= 2;
                row[i] = 0;
                lastValCanCombine = false;
            } else if (row[i] > 0) {
                // move value to the right
                lastValIndex--;
                row[lastValIndex] = row[i];
                if (i != lastValIndex) {
                    row[i] = 0;
                }
                lastValCanCombine = true;
            }
        }
        return row;
    }

    public static void printRow(int[] row) {
        String str = "[";
        for (int i = 0; i < row.length - 1; i++) {
            str += row[i] + " ";
        }
        System.out.println(str + row[row.length - 1] + "]");
    }

    public static int[] reverseArray(int[] row) {
        for (int i = 0; i < row.length / 2; i++) {
            int temp = row[i];
            row[i] = row[row.length - i - 1];
            row[row.length - i - 1] = temp;
        }
        return row;
    }

}
