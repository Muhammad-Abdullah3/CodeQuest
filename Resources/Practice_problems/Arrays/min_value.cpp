#include<iostream>
using namespace std;
int main()
{
	int min;
	int a[6];
	for(int i=0;i<=5;i++)
	{
		cin>>a[i];
	}
    min = a[0];
	for(int j=0;j<=5;j++)
	{
		if(min>a[j])
		{
			min=a[j];
		}
	}
	cout<<min;
	return 0;
}