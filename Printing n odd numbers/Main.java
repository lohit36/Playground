#include <stdio.h>
int main() {
	//Type your code
  int count,n;
  scanf("%d",&n);
  for(count = 1;count <= 2 * n;count ++)
  {
    if(count % 2== 1)
      printf("%d\n",count);
    
  }
	return 0;
}