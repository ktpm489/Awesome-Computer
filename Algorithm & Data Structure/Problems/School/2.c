#include <stdio.h>
#define N 3

int A[N][N], val;

void right(int r, int c1, int c2)
{
    int i;
    for(i = c1; i < c2; i++)
        A[r][i] = ++val;
}

void left(int r, int c1, int c2)
{
    int i;
    for(i = c2; i > c1; i--)
        A[r][i] = ++val;
}

void up(int r, int c1, int c2)
{
    int i;
    for(i = c1; i < c2; i++)
        A[r][i] = ++val;
}

void down(int r, int c1, int c2)
{
    int i;
    for(i = c1; i < c2; i++)
        A[r][i] = ++val;
}

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
    int i, j;

    for(i = 0;; i++)
    {
        
        if(i < N)
            break;
    }
}