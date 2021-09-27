#include <stdio.h>
#include <stdlib.h>

int main()
{
int a[1000000];
int i,limit;
    printf("Enter array size");
    scanf("%d",&limit);

    printf("enter a value");
    for(i=0;i<limit;i++){
    scanf("%d",&a[i]);
    }
    printf("enter value are");
    for (i=0;i<limit;i++){
    printf("%d",a[i]);
    }
    return 0;
}
