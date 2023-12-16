#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int ind,num,sum,n;
    cout<<"Enter the number: \a";
    cin>>num;
    n = num;
    sum =0;
    while(n!=0)
    {
        ind = n%10;
        sum = sum+(ind*ind*ind);
        n/=10;
    }
    if (sum==num)
        cout<<num<<" is an Armstrong number.";
    else
        cout<<num<<" is not an Armstrong number.";
    getch();
    return 0;
}