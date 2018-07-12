#include <stdio.h>
#include <stdlib.h>

void flip(int **arr, int x, int y)
{
    int i, j;
    for(i = 0; i <= y; i++)
        for(j = 0; j <= x; j++)
            arr[i][j] = !arr[i][j];
}

int main(void)
{
    int **arr, N, M, cnt = 0, i, j;
    char *tmp;
    scanf("%d %d", &N, &M);

    arr = (int**) calloc(N, sizeof(int*));
    tmp = (char*) calloc(M + 1, sizeof(char));
    for(i = 0; i < N; i++)
    {
        arr[i] = (int*) calloc(M, sizeof(int));
        scanf("%s", tmp);
        for(j = 0; j < M; j++)
            arr[i][j] = (int)tmp[j] - 48;
    }

    for(i = N - 1; i >= 0; i--)
        for(j = M - 1; j >= 0; j--)
            if(arr[i][j] == 1)
            {
                flip(arr, j, i);
                cnt++;
            }
    printf("%d", cnt);

    return 0;
}