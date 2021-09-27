#include <stdio.h>
#include <stdlib.h>

int main()
{
int limit=10,i,k;
    for(i=1;i<=limit;i++){
    for(k=0;k<i;k++){
    printf("*");
    }
    printf("\n");
    }
    return 0;
}
