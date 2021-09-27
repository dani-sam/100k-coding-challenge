#include <stdio.h>
#include <stdlib.h>
int sum();
int main()
{
int R;
    R=sum();
    printf("Result is %d",R);
return 0;
}

int sum(){
int n1,n2,n3;
printf("Enter two number");
scanf("%d%d",&n1,&n2);
n3=n1+n2;
return n3;
}
