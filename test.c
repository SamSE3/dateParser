#include <stdio.h>
#include <stdlib.h>
//#include "board.c"
#include "2048.h"

int line_vector_test(int i1, int i2, int i3, int i4, char *msg,
        int o1, int o2, int o3, int o4, int (*func)(int, int *)) {
    int list[4] = {i1, i2, i3, i4};
    if (msg) printf("%s - ", msg);
    else {
        printf("Tilting {%d,%d,%d,%d} left yields {%d,%d,%d,%d} - ",
                i1, i2, i3, i4, o1, o2, o3, o4);
    }
    fflush(stdout);
    func(4, list);
    if ((list[0] != o1) || (list[1] != o2) || (list[2] != o3) || (list[3] != o4)) {
        printf("FAILED: {%d,%d,%d,%d} became {%d,%d,%d,%d} instead of"
                " {%d,%d,%d,%d}\n",
                i1, i2, i3, i4, list[0], list[1], list[2], list[3],
                o1, o2, o3, o4);
        return -1;
    }
    printf("PASSED.\n");
    return 0;

}

int board_vector_test(int **boardI, char *msg, int **boardO, int size, int (*func)(int, int **)) {
    int x, y, bad = 0;
    //printf("copying ...\n");
    int **boardC = boardCopy(size, boardI);
    if (msg) printf("%s - ", msg);
    else {
        printf("Tilting\n");
        board_display(size, boardI);
        printf("left yields\n");
        board_display(size, boardO);
    }

    fflush(stdout);
    func(size, boardI);

    for (y = 0; y < size; y++) {
        for (x = 0; x < size; x++) {
            if (boardI[x][y] != boardC[x][y]) {
                //printf("[% 5d]", boardI[x][y]);
                x = size;
                y = size;
                bad = 1;
            };
        }
    }
printf("\n");
    if (bad == 1) {
        printf("FAILED:\n");
        board_display(size, boardC);
        printf("became\n");
        board_display(size, boardI);
        printf("instead of\n");
        board_display(size, boardO);
        return -1;
    }
    printf("PASSED.\n");
    return 0;
}

int ttl_vector(int i1, int i2, int i3, int i4, char *msg,
        int o1, int o2, int o3, int o4) {
    return line_vector_test(i1, i2, i3, i4, msg, o1, o2, o3, o4, tilt_line_left);
}

int tt2_vector(int **boardI, char *msg, int **boardO) {
    return board_vector_test(boardI, msg, boardO, 4, tilt_board_left);
}

int test_tilt_left() {
    int e = 0;
    e |= ttl_vector(0, 0, 0, 0, "Empty list is empty after shift", 0, 0, 0, 0);
    e |= ttl_vector(1, 0, 0, 0, "Value on left stays on left after shift", 1, 0, 0, 0);
    e |= ttl_vector(0, 0, 0, 1, "Value on right shifts to left edge after shift", 1, 0, 0, 0);
    e |= ttl_vector(0, 0, 1, 0, "Value in middle shifts to left edge after shift", 1, 0, 0, 0);
    e |= ttl_vector(1, 2, 4, 8, "Distinct values don't combine", 1, 2, 4, 8);
    e |= ttl_vector(1, 1, 1, 1, "Combinations don't cascade", 2, 2, 0, 0);
    e |= ttl_vector(2, 1, 1, 2, "Combinations don't cascade 2", 2, 2, 2, 0);
    e |= ttl_vector(2, 0, 1, 1, "Combinations don't cascade 3", 2, 2, 0, 0);
    e |= ttl_vector(1, 0, 0, 2, "Bring together", 1, 2, 0, 0);
    e |= ttl_vector(0, 0, 1, 1, NULL, 2, 0, 0, 0);
    e |= ttl_vector(4, 0, 1, 1, NULL, 4, 2, 0, 0);
    e |= ttl_vector(2, 0, 1, 1, NULL, 2, 2, 0, 0);
    return e;
}

int test_board_left() {

int **iBoard=alloca(4*sizeof(int*));
//iBoard[0] = =alloca(sizeof(int)*4);
//iBoard[1] = =alloca(sizeof(int)*4);
//iBoard[2] = =alloca(sizeof(int)*4);
//iBoard[3] = =alloca(sizeof(int)*4);

int ib0[4]={0,0,0,0};
int ib1[4]={0,0,0,0};
int ib2[4]={0,0,0,0};
int ib3[4]={0,0,0,0};

iBoard[0]=&ib0[0];
iBoard[1]=&ib1[0];
iBoard[2]=&ib2[0];
iBoard[3]=&ib3[0];

int **oBoard = boardCopy(4,iBoard);

    int e = 0;
    e |= tt2_vector(board_create(4), NULL, board_create(4));
    e |= tt2_vector(iBoard, NULL, oBoard);   
    return e;
}

int main(int argc, char **argv) {
    int e = 0;
    e |= test_board_left();
    e |= test_tilt_left();
    return e;
}