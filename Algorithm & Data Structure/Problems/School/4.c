/* 에라토스테네스의 체를 이용한 소수 찾기 */
#include <stdio.h>
#include <math.h>

#define L 100

int main(void)
{
    int arr[L + 1], i, j;

    //숫자 채우기
    for(i = 1; i <= L; i++)
        arr[i] = i;
    
    //에라토스테네스의 체 이용
    arr[1] = 0;
    for(i = 1; i * i <= L; i++)
        if(arr[i] != 0)
            for(j = i * i /* 2 ~ i-1를 인수로 갖는 수는 이미 제거되었으므로 i*i부터 */; j <= L; j += arr[i])
                arr[j] = 0;

    //출력
    for(i = 1; i <= L; i++)
        if(arr[i] != 0)
            printf("%d\n", arr[i]);

    return 0;
}