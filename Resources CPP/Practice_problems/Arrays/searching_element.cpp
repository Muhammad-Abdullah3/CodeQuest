#include<iostream>
using namespace std;
int main()
{
	int sear_ele;//variable to store value of search element
	int arr[6];
	cout<<"Enter values in the array:";
	for(int i=0;i<=5;i++)
	{
		cin>>arr[i];
	}
    cout<<"Enter the element you want to search: ";
    cin>>sear_ele;
    //Searching the element
	for(int j=0;j<=5;j++)
	{
		if(sear_ele==arr[j])
		{
			cout<<"Element found in the array.";
			break;
		}
	}
	
	return 0;
}