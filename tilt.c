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
/*

apples
    i = 0;
    while (i < length) {
        if (line[i] != 0) {
            j = i;
            j++;
            if (line[j] == 0) {
                while (j < length && line[j] == 0) {
                    j--;
                }
                if (line[i] == line[j]) {
                    line[i] = 2 * line[j];

                } else {
                    line[i + 1] = line[j];

                }
                line[j] = 0;
            } else if (line[i] == line[j]) {
                line[i] = 2 * line[i];
                line[j] = 0;
            }
            i++;
        }
    }
*/
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

    //line[0]=7;

    return 0;
}

/*
int tilt_line_right(int length, int *line){
    reverseLine(length,line);
    tilt_line_left(length,line);
    reverseLine(length,line);
}

int tilt_line_up(int length, int *line){
    tilt_line_left(length,line);
}

int tilt_line_down(int length, int *line){
    reverseLine(length,line);
    tilt_line_left(length,line);
    reverseLine(length,line);    
}

void reverseLine(int length, int *line) {
    int i = 0;
    while (i < length / 2) {
        int line it = line[i];
        line[i] = line[length - 1 - i];
        line[length - 1 - i] = it;
    }
}
*/