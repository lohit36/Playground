#include <stdio.h>

int main() {
	//Type your code
  int n,new_n,count,sum = 0,rem;
  scanf("%d",&n);
  new_n = n;
  while(n > 0)
  {
    rem = n % 10;
    int fact = 1;
    for(int i = 1;i <= rem;i++)
    {
      fact = fact *i;
    }
    sum = sum + fact;
    n = n / 10;
  }
  if(sum == new_n)
    printf("Yes");
  else
    printf("No");
  return 0;
}





