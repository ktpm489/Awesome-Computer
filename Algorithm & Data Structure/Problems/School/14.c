/* 최대공약수 & 최소공배수 */
#include <stdio.h>

int GCD(int n1, int n2)
{
    return n1 % n2 == 0 ? n2 : GCD(n2, n1 % n2);
}

int main(int argc, char const *argv[])
{
    int n1, n2, G;
    scanf("%d %d", &n1, &n2);
    printf("GCD: %d\n", G = GCD(n1, n2));
    printf("LCM: %d\n", (n1 * n2) / G);
    return 0;
}
