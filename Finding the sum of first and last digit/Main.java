#include <stdio.h>
int main() {
	//Type your code
	
  int n,last,first,sum;
  scanf("%d",&n);
  last = n % 10;
  while(n > 10){
    n = n / 10;
  }
 sum = n + last;
  printf("%d",sum);
  return 0;
}