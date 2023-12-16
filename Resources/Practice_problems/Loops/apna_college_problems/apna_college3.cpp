#include<iostream>
using namespace std;
int main()
{
    int row_col;
    cout<<"Enter the number of rows and coloumns: ";
    cin>>row_col;
    for(int i=1;i<=row_col;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}