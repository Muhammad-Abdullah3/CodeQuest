#include<iostream>
using namespace std;
int main()
{
	char low_case[6],conv_arr[6];
	cout<<"Enter lower case alphabets in the array:";
	for(int i=0;i<=5;i++)
	{
		cin>>low_case[i];
	}
    //Converting the element in upper case and storing it in a different array
	for(int j=0;j<=5;j++)
	{
		if(low_case[j]=='a')
		{
			conv_arr[j]='A';
		}
		else
		{
			int extra = low_case[j]-'a';
			conv_arr[j] = 'A'+extra;
		}
	}
	//printing out the array
	cout<<"Array after conversion into upper case: "<<endl;
	for(int k=0;k<6;k++)
	{
		cout<<conv_arr[k]<<"\t";
	}
	return 0;
}
