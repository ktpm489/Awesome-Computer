//2822 - 점수 계산

#include <stdio.h>

int main(void)
{
    int score[8][3] = { 0, };
    int i, j, sum;

    for(i = 0; i < 8; i++)
    {
        scanf("%d", &score[i]);
        score[i][1] = i + 1;
        score[i][2] = 1;
    }

    for(i = 0; i < 8; i++)
        for(j = 0; j < 8; j++)
            if(score[i][0] < score[j][0])
                score[i][2]++;

    for(i = 0, sum = 0; i < 8; i++)
        if(score[i][2] <= 5)
            sum += score[i][0];
    printf("%d\n", sum);
    for(i = 0; i < 8; i++)
        if(score[i][2] <= 5)
            printf("%d ", score[i][1]);
    

    return 0;
}