#include<stdio.h>
int main()
{
  //Type your code here
  int q,w;
  scanf("%d%d",&q,&w);
  if(q>w)
    printf("num1 is the greatest");
  if(q<w)
    printf("num2 is the greatest");
  if(q==w)
    printf("Both number Equal");
  return 0;
}