#include<iostream>
using namespace std;
int main()
{
    int num;
    cin>>num;
    for(int i=1;i<=num;i++)
    {
        for(int j=1;j<=num-i+1;j++)
        {
            cout<<i<<" ";
        }
        cout<<endl;
    }
    return 0;
}