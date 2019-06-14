#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,new_n,rem,sum = 0,count;
  scanf("%d",&n);
  new_n = n;
  while(n > 0)
  {
    n = n/10;
    count = count + 1;
  }
  n = new_n;
  while(n > 0)
  {
    rem = n % 10;
    sum = sum + pow(rem,count);
    n = n / 10;
  }
  if(sum == new_n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}