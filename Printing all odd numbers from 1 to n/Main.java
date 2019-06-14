// with one varible
#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
	int count = 1;
	for(count = 1;count <= n;count++)
    {
	    if(count % 2 == 1)
	        printf("%d\n",count);
	    
	   
	}
	return 0;
}