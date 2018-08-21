#include <stdio.h>
#include "tool.h"

void bubble_sort(int *arr, int length, _Bool desc)
{
    int i, j;
    _Bool flag;
    for(i = length - 1; i > 0; i--)
    {
        flag = 0;
        for(j = 0; j < i; j++)
            if((!desc && arr[j] > arr[j + 1]) || (desc && arr[j] < arr[j + 1]))
                swap(&arr[j], &arr[j + 1]), flag = 1;
        if(!flag)
            break;
    }
}

int main(int argc, char const *argv[])
{
    bubble_sort(arr, LENGTH, 0);
    print(arr, LENGTH);
    bubble_sort(arr, LENGTH, 1);
    print(arr, LENGTH);
    
    return 0;
}
