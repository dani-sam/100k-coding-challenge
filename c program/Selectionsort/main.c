#include <stdio.h>
#include <stdlib.h>

int main()
{
int l,i,v[1000],temp,j;
    printf("Enter array limit");
    scanf("%d",&l);

    printf("Enter values");
    for(i=0;i<l;i++){
    scanf("%d",&v[i]);
    }

    for(i=0;i<l-1;i++){
    for(j=i+1;j<l;j++){
    if(v[i]>v[j]){
    temp=v[i];
    v[i]=v[j];
    v[j]=temp;
    }
    }
    }
    printf("solted values:");
    for(i=0;i<l;i++){
    printf("%d ",v[i]);
    }
        return 0;
}
