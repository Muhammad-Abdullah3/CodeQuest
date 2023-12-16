#include<iostream>
using namespace std;
int main()
{
	int max;
	int a[6];
	for(int i=0;i<=5;i++)
	{
		cin>>a[i];
	}
    max = a[0];
	for(int j=0;j<=5;j++)
	{
		if(a[j]>max)
		{
			max=a[j];
		}
	}
	cout<<min;
	return 0;
}