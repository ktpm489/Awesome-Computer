#include <stdio.h>
#include "tool.h"

void selection_sort(int *arr, int length, _Bool desc)
{
    int i, j, m;

    for(i = 0; i < length - 1; i++)
    {
        m = i;
        for(j = i + 1; j < length; j++)
            if((!desc && arr[m] > arr[j]) || (desc && arr[m] < arr[j]))
                m = j;
        swap(&arr[i], &arr[m]);
    }
}

int main(int argc, char const *argv[])
{
    selection_sort(arr, LENGTH, 0);
    print(arr, LENGTH);
    selection_sort(arr, LENGTH, 1);
    print(arr, LENGTH);

    return 0;
}
