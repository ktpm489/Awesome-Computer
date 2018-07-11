/* 짝수 팩토리얼의 합계 구하기 */
#include <stdio.h>
#define L 10

int main(int argc, char const *argv[])
{
    int i, F = 1, S = 0;
    /*
    for(i = 2; i <= L; i++)
    {
        F *= i;
        if(i % 2 == 0) S += F;
    }
    */
   for(i = 2; i <= L; i += 2)
   {
       F *= i * (i - 1);
       S += F;
   }
    printf("%d", S);
    return 0;
}
    