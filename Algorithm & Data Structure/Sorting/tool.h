//data & length
#define LENGTH 10
int arr[LENGTH] = { 3, 4, 5, 1, 8, 2, 9, 10, 7, 6 };

//swap function
void swap(int *n1, int *n2)
{
    int tmp = *n1;
    *n1 = *n2;
    *n2 = tmp;
}

//print function
void print(int *arr, int length)
{
    int i;
    for(i = 0; i < length; i++)
        printf("%3d", arr[i]);
    printf("\n");
}