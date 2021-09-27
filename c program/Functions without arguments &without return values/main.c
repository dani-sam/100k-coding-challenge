#include <stdio.h>
#include <stdlib.h>

void sum();

int main()
{
    sum();
    return 0;
}


void sum(){
int num1,num2,num3;
printf("Enter two number");
scanf("%d%d",&num1,&num2);
num3=num1+num2;
printf("Result is %d",num3);
}
