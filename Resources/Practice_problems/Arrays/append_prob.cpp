#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int size1 = 4,size2=5;
    int first[size1]={0};
    int sec[size2] = {0};
    int merge_arr[size1+size2];
    int count = 0;
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
    //Loop to merge both arrays
    for(int z=0;z<(size1+size2);z++)
    {
        if(count<(size1-1))
        {
        merge_arr[z]=first[count];
        count++;
        }
        else
        {
            count = 0;
            merge_arr[z]=sec[count];
            count++;
        }
    }
    //loop to print out the merged array
    cout<<"Merged array: \n";
    for (int i=0;i<(size1+size2);i++)
    {
        cout<<merge_arr[i]<<endl;
    }
    getch();
    return 0;
}