/*Write a program that inputs two numbers in main() funcion, pases these numbers to a function. 
The function displays the maximum number*/
#include<iostream>
using namespace std;
int max(int,int);
int main()
{
    int large = max(56,76);
    cout<<"Maximum number is: "<<large;
    return 0;
}
int max(int a, int b)
{
    int max = a;
    if(a<b)
        max = b;
    return max;
}