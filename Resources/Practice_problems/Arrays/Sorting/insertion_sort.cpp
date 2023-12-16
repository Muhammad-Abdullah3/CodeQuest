#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int size =5;//Size of the array
    int arr[size] = {0};
    int max = 0; //swapping variable
    //using loop to input the values in arrays
    cout<<"Enter elements of the array: ";
    for(int x=0;x<size;x++)
    {
        cin>>arr[x];
    }
    max = arr[0];
    //Sorting
    for(int y=0;y<size;y++)
    {
        for(int z=0;z<size;z++)
        {
            if(arr[z]<arr[z+1])
            {
                max = arr[z+1];
                arr[z+1] = arr[z];
                arr[z] = max;
            }
        }
    }
    cout<<"Array after sorting in Descending order: ";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<endl;
    }
    getch();
    return 0;
}