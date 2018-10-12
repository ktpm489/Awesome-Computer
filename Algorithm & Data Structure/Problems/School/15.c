/* 후위표기법 */

/* Includes */
#include <stdio.h>

/* Defines */
#define N 8
#define STACK_SIZE 15

/* Vars */
char expression[] = "(((A+(B*C))-(D/E))+((F-G)*H))";
int num[] = {543, 13, 8, 42, 7, 6, 3, 2};

/* Stacks */
char stack[STACK_SIZE], postStack[STACK_SIZE];
int calcStack[STACK_SIZE];

/* Stack Pointers */
int s_p = -1, ps_p = -1, cs_p = -1;

int main(void)
{
  char *p = expression;
  int i, j;

  while (*p)
  {
    switch (*p)
    {
    case '+':
    case '-':
    case '*':
    case '/':
      stack[++s_p] = *p;
      break;
    case ')':
      postStack[++ps_p] = stack[s_p--];
      break;
    case '(':
      break;
    default:
      postStack[++ps_p] = *p;
      break;
    }
    p += 1;
  }

  printf("%s\n", postStack);

  int n1, n2;
  for (i = 0; i <= ps_p; i++)
  {
    switch (postStack[i])
    {
    case '+':
      n1 = calcStack[cs_p--]; n2 = calcStack[cs_p--];
      calcStack[++cs_p] = n2 + n1;
      break;
    case '-':
      n1 = calcStack[cs_p--]; n2 = calcStack[cs_p--];
      calcStack[++cs_p] = n2 - n1;
      break;
    case '*':
      n1 = calcStack[cs_p--]; n2 = calcStack[cs_p--];
      calcStack[++cs_p] = n2 * n1;
      break;
    case '/':
      n1 = calcStack[cs_p--]; n2 = calcStack[cs_p--];
      calcStack[++cs_p] = n2 / n1;
      break;
    default:
      calcStack[++cs_p] = num[postStack[i] - 65];
      break;
    }
    for(j = 0; j <= cs_p; j++) printf("%d ", calcStack[j]);
    printf("\n");
  }

  printf("%d\n", calcStack[0]);
  return 0;
}