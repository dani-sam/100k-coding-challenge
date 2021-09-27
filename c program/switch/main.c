#include <stdio.h>
#include <stdlib.h>

int main()
{
int choice;
    printf("1 for porotta\n 2for biryani \n 3 for fired rice \n 4 for mandhi \n enter your chocie");
    scanf("%d",&choice);
    switch(choice){
    case 1:
    printf("you are select porotta");
    break;
    case 2:
    printf("you are select biryani");
    break;
    case 3:
    printf("you are select fire rice");
    break;
    case 4:
    printf("you are select mandhi");
    break;
    default:
    printf("!!!FOOL!!!!");
        }
    return 0;
}
