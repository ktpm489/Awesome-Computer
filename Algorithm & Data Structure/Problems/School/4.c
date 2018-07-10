/* 에라토스테네스의 체를 이용한 소수 찾기 */
#include <stdio.h>
#include <math.h>

#define L 25

int main(void)
{
    int arr[L + 1], i, j;

    for(i = 1; i <= L; i++)
        arr[i] = i;
    arr[1] = 0;
    for(i = 1; i * i <= L; i++)
    {
        if(arr[i] != 0)
        {
            for(j = i * 2; j <= L; j += arr[i])
                arr[j] = 0;
        }
    }

    for(i = 1; i <= L; i++)
        if(arr[i] != 0)
            printf("%d\n", arr[i]);

    return 0;
}