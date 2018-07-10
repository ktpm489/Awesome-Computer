/* 숫자를 직각삼각형으로 출력 */
#include <stdio.h>
#define N 5

int main(void)
{
    int A[N][N], i, j;

/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    ...
    for(i = 1; i <= N; i++)
    {
        for(j = 1; j < i; j++)
            printf("%3d", j);
        printf("\n");
    }
*/

/*
    1
    2 3
    3 4 5
    4 5 6 7
    5 6 7 8 9
    ...
*/
    for(i = 1; i <= N; i++)
    {
        for(j = i; j < i * 2; j++)
            printf("%3d", A[i - 1][j - i] = j);
        printf("\n");
    }

    printf("\n");

    for(i = 0; i < N; i++)
    {
        for(j = 0; j <= i; j++)
            printf("%3d", A[i][j]);
        printf("\n");
    }

    return 0;
}