#include <stdio.h>
#include <stdlib.h>

int main()
{
int l,i,dd[1000],sum=0;
    printf("Enter array limit ");
    scanf("%d",&l);

    printf("enter values \n");
    for (i=0;i<l;i++){
    scanf("%d",&dd[i]);
    }
    for(i=0;i<l;i++)
    {
    sum=sum+dd[i];
    }
    printf("result: %d",sum);
    return 0;
}
