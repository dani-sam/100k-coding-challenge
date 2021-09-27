#include <stdio.h>
#include <stdlib.h>

int main()
{
float num1,num2,num3,num4;
    printf("Enter three number");
    scanf("%f%f%f",&num1,&num2,&num3);
    num4=(num1+num2+num3)/3;
    printf("the result is %f",num4);
    return 0;
}
