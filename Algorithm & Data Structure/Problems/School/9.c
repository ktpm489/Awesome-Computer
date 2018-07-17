/* 등차수열의 합 */
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int i = 0, sum = 0;
    while(1)
    {
        sum += ++i;
        if(sum >= 10)
        {
            printf("%d, %d", i, sum);
            break;
        }
    }
    return 0;
}
