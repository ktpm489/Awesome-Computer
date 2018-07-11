/* 최대와 최소를 제외한 산술평균 구하기 */
#include <stdio.h>
#include <stdlib.h>


int main(int argc, char const *argv[])
{
    int *scoreArr, N, A, i, S = 0, min = 0, max = 0;

    scanf("%d", &N);
    scoreArr = (int*) calloc(N, sizeof(int));

    for(i = 0; i < N; i++)
        scanf("%d", &scoreArr[i]);

    for(i = 1; i < N; i++)
    {
        if(scoreArr[min] > scoreArr[i])
            min = i;
        if(scoreArr[max] < scoreArr[i])
            max = i;
    }
    scoreArr[min] = 0, scoreArr[max] = 0;

    for(i = 0; i < N; i++)
        S += scoreArr[i];
    
    printf("%lf", (double)S / (N - 2));
    
    return 0;
}
