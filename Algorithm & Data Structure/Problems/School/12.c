/* 77*1 + 76*2 + 75*3 + ... + 2*76 + 1*77 */
#include <stdio.h>
#define N 78


int main(int argc, char const *argv[])
{
    int i, S;
    for(i = 1; i <= N - 1; i++)
        S += i * (N - i);
    printf("%d", S);
    return 0;
}
