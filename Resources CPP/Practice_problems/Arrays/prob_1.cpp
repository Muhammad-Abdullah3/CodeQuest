//Write a C++ program to find the largest element of a given array of integers.
#include<iostream>
using namespace std;
int main()
{
    int arr[10];
    //Declaring a variable to store the largest value in the array
    int larg=0;
    //loop for input and assigning of the array
    for(int i=0;i<=9;i++)
    {
        cin>>arr[i];
    }
    //loop to find largest element of a given array of integers
    for(int x=0;x<=9;x++)
    {
        //inner loop
        for(int y=x;y<=9;y++)
        {
            if(arr[x]>arr[y])
            {
                larg = arr[x];
                break;
            }
        }
    }
    cout<<"Largest value in the array of integers = "<<larg;
    return 0;
}