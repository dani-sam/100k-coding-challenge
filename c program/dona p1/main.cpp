#include <iostream>
#include<cstdio>
using namespace std;

int main()
{
    char str[20];
	int i=0;
	cout<<"Enter the string:";
    gets(str);
    while(str[i]!='\0')
    {
		i++;
	}
	cout<<"Length of the string is "<<i;
    return 0;
}
