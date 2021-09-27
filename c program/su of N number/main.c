#include <stdio.h>
#include <stdlib.h>

int main()
{
int num,i,sum=0;
    printf("Enter a number \n");
    scanf("%d",&num);
    for(i=1;i<num;i++){
    sum=sum+i;
    }
    printf("result is %d",sum);
    return 0;
}
