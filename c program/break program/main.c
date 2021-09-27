#include <stdio.h>
#include <stdlib.h>

int main()
{
int i;
    for(i=0;i<10;i++){
    printf("hi \n");
    if(i==5){
    break;
    }
    printf("hello \n");
    }
    printf("finished \n");
    return 0;
}
