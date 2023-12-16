#include<iostream>
using namespace std;
int main()
{
    int arr[5]={13,14,5,6,7};
    int target=19;
    int indices_arr[2];
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                indices_arr[0]=i;
                indices_arr[1]=j;
            }
        }
    }
    cout<<"Sum of index "<<indices_arr[0]<<" and index "<<indices_arr[1]<<"="<<target;
    return 0;
}