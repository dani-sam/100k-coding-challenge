#include <stdio.h>
#include <stdlib.h>

int main()
{
int a,b,c;
    printf("Enter three no:");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b&&a>c){
    printf("The largest no: %d ",a);
    }else if(b>c){
    printf("The largest no: %d",b);
    }else{
    printf("The largest no: %d",c);
    }

    return 0;
}
