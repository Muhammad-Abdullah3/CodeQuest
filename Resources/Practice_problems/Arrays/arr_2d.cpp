#include<iostream>
using namespace std;
int main()
{
	//initializing a 2d array
	int arr_2d[3][3];
	cout<<"Enter all the values in the 2d Array:";
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cin>>arr_2d[i][j];
		}
	}
	//output of the array
	cout<<"The entered 2d array is:\n";
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cout<<arr_2d[i][j]<<"\t";
		}
		cout<<endl;
	}
}