#include <stdio.h>
#include <stdlib.h>

int main()
{
int a[3][3],i,j;
    printf("Enter values \n");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++){
    scanf("%d",&a[i][j]);
    }
    }

    printf("Enter values are \n");

    for(i=0;i<3;i++){
    for(j=0;j<3;j++){
    printf("%d ",a[i][j]);
    }
    printf("\n");
    }
    return 0;
}
