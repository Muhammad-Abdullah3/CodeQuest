#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int size1 = 4,size2=4;
    int first[size1]={0};
    int sec[size2] = {0};
    int sum_arr[size1]={0};
    //Loop to get input of both arrays
    cout<<"Enter the values in first array: ";
    for(int i=0;i<size1;i++)
    {
    	cin>>first[i];
	}
	cout<<"Enter the values in second array: ";
    for(int i=0;i<size2;i++)
    {
    	cin>>sec[i];
	}
    //Loop to sum both arrays if they have equal size
    if(size1==size2)
    {
	
		for(int z=0;z<size1;z++)
    	{
    
        	{
        	sum_arr[z]=first[z]+sec[z];
        	}
    	}
	}
    else
    {
    	cout<<"Size of both arrays is not the same.";
	}
    //loop to print out the merged array
    cout<<"Array after Sum: \n";
    for(int i=0;i<size1;i++)
    {
        cout<<sum_arr[i]<<"\t";
    }
    getch();
    return 0;
}