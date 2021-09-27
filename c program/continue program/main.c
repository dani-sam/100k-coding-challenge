#include <stdio.h>
#include <stdlib.h>

int main()
{
int i;
    for(i=0;i<10;i++){
    printf("HI \n");
    if(i==5){
    continue;
    }
    printf("HELLO \n");
    }
    printf("FINISHED \n");
    return 0;
}
