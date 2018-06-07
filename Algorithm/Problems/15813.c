#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int stones, blackMax, whiteMin, bsCnt, wsCnt, maxLength, length, i, j;
    char stonesArr[300010];
    
    scanf("%d %d %d", &stones, &blackMax, &whiteMin);
    scanf("%s", stonesArr);

    maxLength = 0;
    for(i = 0; i < stones; i++)
    {
        length = 0, bsCnt = 0, wsCnt = 0;
        for(j = i; j < stones; j++)
        {
            switch(stonesArr[j]) {
                case 'W':
                    wsCnt++;
                    break;
                case 'B':
                    bsCnt++;
                    break;
            }
            if(bsCnt > blackMax)
                break;
            length++;
        }
        if(wsCnt < whiteMin)
            length = 0;
        if(maxLength < length)
            maxLength = length;
        if(stones - i < maxLength)
            break;
    }

    printf("%d", maxLength);
    
    return 0;
}