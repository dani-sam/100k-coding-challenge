#include <stdio.h>
#include <stdlib.h>

int main()
{
int num1,num2,result,choice;
    printf("Enter 2 no:");
    scanf("%d%d",&num1,&num2);
    printf("1 for addition \n 2 for subraction \n 3 for multiplication /n 4 for division \n Enter your choice");
    scanf("%d",&choice);
    if(choice==1){
    result=num1+num2;
    printf("result is %d",result);
    }else if (choice==2){
    result=num1-num2;
    printf("results=%d",result);
    }else if (choice==3){
    result=num1*num2;
    printf("result is %d",result);
    }else if (choice==4){
    result=num1/num2;
    printf("result is %d",result);
    }else{
    printf("!!!FOOL!!!");
    }
    return 0;
}
