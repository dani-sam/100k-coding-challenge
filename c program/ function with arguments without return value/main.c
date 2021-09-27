#include <stdio.h>
#include <stdlib.h>
void sum(int,int);
int main()
{
int a,b;
    printf("Enter two number");
    scanf("%d%d",&a,&b);
    sum(a,b);
    return 0;
}
 void sum(int n1,int n2){
  int R;
  R=n1+n2;
  printf("Result is %d",R);
  }
