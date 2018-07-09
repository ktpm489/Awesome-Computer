#include <stdio.h>
#define N 5

int main(void)
{
    /*
    1 2 3
    8 9 4
    7 6 5

    1  2  3  4
    12 13 14 5
    11 16 15 6
    10 9  8  7
    */
    int A[N][N] = { 0, }, ci = 0, cj = 0, bi, bj;
    int i, flag = 0;

    for(i = 1; i < N * N; i++)
    {
        bi = ci, bj = cj;
        switch(flag % 4)
        {
            case 0:
                A[ci][cj++] = i;
                break;
            case 1:
                A[ci++][cj] = i;
                break;
            case 2:
                A[ci][cj--] = i;
                break;
            case 3:
                A[ci--][cj] = i;
                break;
        }
        if(A[ci][cj] != 0 || ci >= N || cj >= N || ci < 0 || cj < 0)
        {
            i--;
            flag++;
            ci = bi;
            cj = bj;
        }
    }
    A[ci][cj] = i;

    for(ci = 0; ci < N; ci++)
    {
        for(cj = 0; cj < N; cj++)
            printf("%3d", A[ci][cj]);
        printf("\n");
    }

    return 0;
}