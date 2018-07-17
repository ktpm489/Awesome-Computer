/* 팩토리얼의 합계 구하기 */
#include <stdio.h>
#define L 10

int fact(int n)
{
    if(n <= 0) return 1;
    return n * fact(n - 1);
}

int main(int argc, char const *argv[])
{
    int i, F = 1, S = 0;
   for(i = 1; i <= L; i++)
    {
        F *= i;
        S += F;
    }

    printf("%d\n", S);

    printf("%d\n", fact(10));
    return 0;
}
