#include<iostream>
using namespace std;
int main()
{
    int rows = 3,cols=3;
    int r1=0,r2=0,r3=0,c1=0,c2=0,c3=0;
    int arr[rows][cols];
    int dia_sum=0;
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cin>>arr[i][j];
            if(i==0&&j==0)
            {
                c1+=arr[i][j];
                r1+=arr[i][j];
            }
            else if(i==0&&j==1)
            {
                c2+=arr[i][j];
                r1+=arr[i][j];
            }
            else if(i==0&&j==3)
            {
                c3+=arr[i][j];
                r1+=arr[i][j];
            }
            else if(i==1&&j==0)
            {
                c1+=arr[i][j];
                r2+=arr[i][j];
            }
            else if(i==1&&j==1)
            {
                c2+=arr[i][j];
                r2+=arr[i][j];
            }
            else if(i==1&&j==2)
            {
                c3+=arr[i][j];
                r2+=arr[i][j];
            }
            else if(i==2&&j==0)
            {
                c1+=arr[i][j];
                r3+=arr[i][j];
            }
            else if(i==2&&j==1)
            {
                c2+=arr[i][j];
                r3+=arr[i][j];
            }
            else if(i==0&&j==1)
            {
                c3+=arr[i][j];
                r3+=arr[i][j];
            }
            if(rows==cols&&j==i)
            {
               dia_sum+=arr[i][j];
            }
        }
    }
    cout<<"Sum of Row 1="<<r1<<endl;
    cout<<"Sum of Row 2="<<r2<<endl;
    cout<<"Sum of Row 3="<<r3<<endl;
    cout<<"Sum of Coloumn 1="<<c1<<endl;
    cout<<"Sum of Coloumn 2="<<c2<<endl;
    cout<<"Sum of Coloumn 3="<<c3<<endl;
    if(rows==cols)
        cout<<"Sum of Diagnols= "<<dia_sum;
    return 0;
}