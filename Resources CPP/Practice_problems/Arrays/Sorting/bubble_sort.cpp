#include<iostream>
using namespace std;
int main()
{
    int max=0,size = 7;
    int arr[size];
    cout<<"Enter the values in the array: ";
    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    
    //Sorting
    for(int j=0;j<size;j++)
    {
        for(int k=0;k<size;k++)
        {
            if(arr[k]>arr[k+1])
            {
                max = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = max;
            }
        }
    }
    cout<<"Sorted array using bubble sort.";
    for(int z=0;z<size;z++)
    {
        cout<<arr[z]<<endl;
    }
    return 0;
}