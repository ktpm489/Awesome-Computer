/* 10진수를 2진수로 변환 */
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int N, D = 1, S = 0;

    scanf("%d", &N);

    while (N > 0)
    {
        S += (N % 2) * D;
        N /= 2;
        D *= 10;
    }

    printf("%d", S);
    return 0;
}
