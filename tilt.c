#include <stdio.h>
#include "2048.h"

int tilt_line_left(int length, int *line) {
    int i, j;
    // make sure vector length is sensible
    if (length < 1 || length > 255) return -1;

    //combine numbers    
    i = (length - 1);
    while (i > 0) {
        if (line[i] != 0) {
            j = i;
            i--;
            if (line[i] == 0) {
                while (i >= 0 && line[i] == 0) {
                    i--;
                }
                line[i + 1] = line[j];
                line[j] = 0;

            } else if (line[i] == line[j]) {
                line[i] = 2 * line[i];
                line[j] = 0;
            }
        } else {
            i--;
        }
    }    

    //push left
    i = (length - 1);
    while (i > 0) {
        if (line[i] != 0) {
            j = i;
            i--;
            if (line[i] == 0) {
                while (i >= 0 && line[i] == 0) {
                    i--;
                }
                line[i + 1] = line[j];
                line[j] = 0;
            }
        } else {
            i--;
        }
    }

    return 0;
}

int tilt_board_left(int size, int **board) {
    int x, y;
    int line[size]
    for (y = 0; y < size; y++) {
        for (x = 0; x < size; x++) {
            line[x] = board[x][y];
        }
        tilt_line_left(size, line);
    }
}