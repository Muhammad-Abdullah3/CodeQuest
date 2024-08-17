#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int row;
    cout<<"Enter number of rows in Floyd Triangle: ";
    cin>>row;
    int number = 1;
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<number<<" ";
            number++;
        }
        cout<<endl;
    }
    getch();
    return 0;
}