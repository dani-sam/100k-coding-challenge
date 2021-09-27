#include <stdio.h>
#include <stdlib.h>

int main()
{
int a[1000];
int i,limit;
    printf("Enter array size ");
    scanf("%d",&limit);

    printf("Enter a value ");
    for(i=0;i<limit;i++){
    scanf("%d",&a[i]);
    }
    printf("Enter a value \n");
    for(i=0;i<limit;i++){
    printf("%d ",a[i]);
    }
    return 0;
}
