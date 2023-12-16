#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int tab_4[7]={0};
    int a =1;
    for(int j =0;j<7;j++)
    {
        tab_4[j] = a*4;
        a++;
        cout<<tab_4[j]<<endl;
    }
    return 0;
}