/*Write a program that inputs a number in main function and passes the number to a function. 
The function displays table of that number*/
#include<iostream>
using namespace std;
void table(int);
int main()
{
    table(7);
    return 0;
}
void table(int a)
{
    for(int i=1;i<=10;i++)
    {
        cout<<a<<" times "<<i<<"="<<a*i<<endl;
    }
}