//2628 - 종이자르기

#include <stdio.h>

int Max(int n1, int n2) {
    return n1 > n2 ? n1 : n2;
}

void swap(int *n1, int *n2) {
    int tmp;

    tmp = *n1;
    *n1 = *n2;
    *n2 = tmp;
}

void sort(int *arr, int length) {
    int i, j, minIndex;
    for(i = 0; i < length; i++) {
        minIndex = i;
        for(j = i; j < length; j++)
            if(arr[minIndex] > arr[j])
                minIndex = j;
        swap(&arr[minIndex], &arr[i]);
    }
}

int main(void)
{
    int width, height, cutNum, widthCutNum = 1, heightCutNum = 1, maxArea = 0, tmp, i, j;
    int widthCut[150] = { 0, }, heightCut[150] = { 0, };

    scanf("%d %d", &width, &height);
    scanf("%d", &cutNum);
    for(i = 0; i < cutNum; i++)
    {
        scanf("%d", &tmp);
        switch(tmp)
        {
            case 0:
                scanf("%d", &widthCut[widthCutNum++]);
                break;
            case 1:
                scanf("%d", &heightCut[heightCutNum++]);
                break;
        }
    }
    
    widthCut[widthCutNum++] = height;
    heightCut[heightCutNum++] = width;
    
    sort(widthCut, widthCutNum);
    sort(heightCut, heightCutNum);

    for(i = 0; i < widthCutNum - 1; i++)
        for(j = 0; j < heightCutNum - 1; j++)
            maxArea = Max((widthCut[i + 1] - widthCut[i]) * (heightCut[j + 1] - heightCut[j]), maxArea);

    printf("%d", maxArea);

    return 0;
}

//모든 조각의 크기를 비교