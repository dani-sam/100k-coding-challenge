#include <stdio.h>
#include <stdlib.h>

int main()
{
int l,i,v[100],sk,flag=0;
    printf("Enter array limit");
    scanf("%d",&l);

    printf("enter values");
    for(i=0;i<l;i++){
    scanf("%d",&v[i]);
    }

printf("Please enter sreaching key");
scanf("%d",&sk);

for(i=0;i<l;i++){
if(sk==v[i]){
flag=1;
break;
}
}
if(flag==1){
printf("values is found at postion is %d",i+1);
}else{
printf("values is not found");
}
    return 0;
}
