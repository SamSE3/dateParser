#include <stdio.h>
#include "2048.h"

int tilt_line_left(int length,int *line)
{
    int i;
  // make sure vector length is sensible
  if (length<1||length>255) return -1;
        int valL = line[0];
  for (i=0; i<(length-1); i++){
      int valR= line[i+1];
      if (valL==valR){
          valL=2*valL;
      }
      valL=valR;
  }
  return 0;
}
