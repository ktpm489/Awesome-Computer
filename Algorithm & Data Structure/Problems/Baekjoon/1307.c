//1307 - 마방진 만들기

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int **arr, N, i, j;
    scanf("%d", &N);

    arr = (int**) calloc(N, sizeof(int*));
    for(i = 0; i < N; i++)
        arr[i] = (int*) calloc(N, sizeof(int));
    
    if(N % 2 == 0)
    {
        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                //짝수마방진
            }
        }
    }
    else
    {
        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                //홀수마방진
            }
        }
    }

    //참고 : http://memorist.tistory.com/151
        
    return 0;
}
