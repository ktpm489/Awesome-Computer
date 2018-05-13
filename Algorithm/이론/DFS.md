깊이우선탐색(Depth First Search)
----------

**1.** 노드 방문
**2.** 방문하지 않은 인접노드 탐색
**3.** 방문하지 않은 노드로 이동
**4.** 모두 방문하였으면 백트래킹

```c
#include <stdio.h>

int arr[6][6];
char visited[2][6] = { 'A', 'B', 'C', 'D', 'E', 'F',
'F', 'F', 'F', 'F', 'F', 'F' };

void dfs(int v)
{
    int i;
    //노드가 방문되지 않았으면  방문되었다고 표시
    if (visited[1][v] == 'F')
    {
        visited[1][v] = 'T';
        printf("%c\n", visited[0][v]);
    }

    for (i = 0; i < 6; i++)
    if(arr[v][i] == 1 && visited[1][i] == 'F')
        dfs(i);

    return;
}

/*
인접행렬

0 1 0 0 1 1
1 0 1 1 0 0
0 1 0 1 0 0
0 1 1 0 0 0
1 0 0 0 0 1
1 0 0 0 1 0
*/

int main(void)
{
    int i, j, n;
    for (i = 0; i < 6; i++)
        for (j = 0; j < 6; j++)
            scanf("%d", &arr[i][j]);

    scanf("%d", &n);
    dfs(n);
}
```