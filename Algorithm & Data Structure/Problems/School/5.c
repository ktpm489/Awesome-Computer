/* 피보나치 수열의 합 */
#include <stdio.h>
#define N 9

int fibo(int n1, int n2, int depth)
{
    if(depth >= N - 2)
        return n1 + n2;
    return fibo(n2, n1 + n2, ++depth);
}

int main(int argc, char const *argv[])
{
    printf("%d", fibo(1, 1, 0) - 1);

    return 0;
}
