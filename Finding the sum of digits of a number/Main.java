#include <stdio.h>
int main() {
	//Type your code
  int n,r,sum = 0;
  scanf("%d",&n);
  while(n !=0)
  {
    r= n % 10;
    n = n/10;
    sum = sum +r;
  }
  printf("%d",sum);
  return 0;
}