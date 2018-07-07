#include <stdio.h>
#include <math.h>

#define N 5

int main(void)
{
    int primeArr[15], arr[N][N];
    int i, j, cnt = 1;
    primeArr[0] = 2;
    for(i = 3; i < 1000; i += 2)
    {
        int remainderCnt = 0;
        for(j = 2; j <= sqrt(i); j++)
            if(i % j == 0)
                remainderCnt++;
        if(remainderCnt == 0)
            primeArr[cnt++] = i;
        if(cnt == 15)
            break;
    }

    cnt = 0;
    for(i = 0; i < N; i++)
    {
        for(j = 0; j >= N - i; j--) //TODO
        {
            printf("%3d", arr[i][N] = primeArr[cnt++]);
        }
        printf("\n");
    }

    return 0;
}