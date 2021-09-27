#include <stdio.h>
#include <stdlib.h>

int main()
{
int num1,num2;
    printf("Enter 2 number");
    scanf("%d%d",&num1,&num2);
    if (num1<num2){
    printf("greater no: is %d",num2);
    }else{
    printf("greater no: is %d",num1);
    }
    return 0;
}
