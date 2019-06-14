#include<stdio.h>
int main()
{
  //Type your code here
  int n,f,l,sum;
 // printf("enter the three digit number\n");
  scanf("%d",&n);
  l=n%10;
  f=n/100;
  sum=l+f;
  printf("%d",sum);
  return 0;
}