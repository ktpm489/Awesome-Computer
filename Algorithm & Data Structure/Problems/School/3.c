#include <stdio.h>
#include <math.h>

#define N 5
#define LIMIT 15

int main(void)
{
    int primeArr[LIMIT] = { 2, 0, }, arr[N][N] = { 0, };
    int i, j, cnt = 1, remainderCnt;
    for(i = 3; i < 1000; i += 2)
    {
        remainderCnt = 0;
        for(j = 2; j <= (int)sqrt(i); j++)
            if(i % j == 0)
            {
                remainderCnt++;
                break;
            }
        if(remainderCnt == 0)
            primeArr[cnt++] = i;
        if(cnt == LIMIT)
            break;
    }

    cnt = 0;
    for(i = 0; i < N; i++)
    {
        for(j = 0; j < N; j++)
        {
            if(i + j >= N - 1)
                printf("%3d", arr[i][j] = primeArr[cnt++]);
            else
                printf("%3c" , ' ');
        }
        printf("\n");
    }

    return 0;
}