/* 계차수열의 합 */
#include <stdio.h>

int main(int argc, char const *argv[])
{
    int i, j = 1, sum = 0;
    for(i = 0; i < 10; i++)
    {
        j += i;
        sum += j;
    }
    printf("%d", sum);
    return 0;
}
