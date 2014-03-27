#include <stdio.h>
#include "2048.h"

int tilt_line_left(int length,int *line)
{
    int i;
    // make sure vector length is sensible
  if (length<1||length>255) return -1;

    
/*
    for (i = (length - 1); i > 0; i=i-2)  {
        if (line[i] != 0) {
            j = i - 1;            
            while (j >= 0) {
                if (line[j] == line[i]) {
                    line[j] = 2 * line[j];
                    line[i] = 0;
                    break;
                } else if (line[j] != 0) {
                    line[j + 1] = line[i]; // make line before
                    line[i] = 0;
                    break;
                } else if (j == 0) {
                    line[0] = line[i];
                    line[i] = 0;
                    i=-1;
                    break;
                }
                j--;
            }
        }
    }
    
*/
    
    
    for (i = (length - 1); i > 0; i--) {
        j = i - 1;
        while (j >= 0) {
            int ln =line[i];
            if (line[j] == 0) {
                line[j] = ln;
                line[j + 1] = 0;
            }
        }        
    }
    line[0]=7;
    
    return 0;
}
