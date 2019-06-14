#include<stdio.h>

int main()
{
  //  printf("\n\n\t\tStudytonight - Best place to learn\n\n\n");

    int a, b, c;

    //printf("Enter 3 numbers:\n");
    scanf("%d%d%d", &a, &b, &c);  //lf is a format specifier to take double as input

    // a is the largest
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
            /*
                .2lf restricts the number till 
                2 decimal places
            */
            printf("second greatest = %d", b);
        }
        else
        {
            printf("second greatest = %d", c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            printf("second greatest = %d",a);
        }
        else
        {
            printf("second greatest = %d",c);
        }
    }

    // c is the largest number of the three
    else if(a >= b)
    {
        printf("second greatest = %d", a);
    }
    else
    {
        printf("second greatest = %d", b);
    }

    
    return 0;
}