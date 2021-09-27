#include <stdio.h>
#include <stdlib.h>
int sum(int,int);
int main()
{
int a,b,c;
    printf("Enter two number");
    scanf("%d%d",&a,&b);
    c=sum(a,b);
    printf("Result is %d",c);
    return 0;
}


int sum(int n1, int n2){
int R;
R=n1+n2;

return R;
}
