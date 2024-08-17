#include<iostream>
using namespace std;
int main()
{
	int sear_ele;//variable to store value of search element
	int size=6;
	int arr[size];
	cout<<"Enter values in the array:";
	for(int i=0;i<=5;i++)
	{
		cin>>arr[i];
	}
    cout<<"Enter the element you want to search: ";
    cin>>sear_ele;
    //Searching the array to see if element exist
    bool found = false;
    for(int i=0;i<size;i++)
    {
    	found=(arr[i]==sear_ele);
    	if(found==true)
    		break;
	}
	if(found==false)
	{
		cout<<"Element is not found the array.";
		exit(0);
	}
    //Searching and deleting the element
	for(int i=0;i<size;i++)
	{
		if(sear_ele==arr[i])
		{
			for(int j=i; j<size; j++)
            {	
				arr[j] = arr[j+1];
			}
			cout<<"Element deleted Successfully.";
			break;
		}
		
	}
	//printing out the array
	cout<<"\nArray after deletion. The last element of the array is garbage and all other are shifted one index to the left.\n";
	for(int i=0;i<size;i++)
	{
		cout<<arr[i]<<endl;
	}
	return 0;
}