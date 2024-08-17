#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int row_1=3,row_2=3,col_1=3,col_2=3;
	int product;
	int arr1[row_1][col_1],arr2[row_2][col_2],prod_arr[row_1][col_2];
	if(col_1==row_2)
	{
		cout<<"Enter the values of First Array: ";
		for(int i=0;i<row_1;i++)
		{
			for(int j=0;j<col_1;j++)
			{
				cin>>arr1[i][j];
			}
		}
		cout<<"Enter the values of Second array Array: ";
		for(int i=0;i<row_1;i++)
		{
			for(int j=0;j<col_1;j++)
			{
				cin>>arr1[i][j];
			}
		}
		//Multiplying and storing the matrix
		for(int x=0;x<row_1;x++)
		{
			
			product=0;
			for(int y=0;y<row_1;y++)
			{
				for(int z=0;z<col_2;z++)
				{
					product+=arr1[y][z]*arr2[z][y];
				}
				prod_arr[x][y]=product;
			}
		}
	}
	//Displaying the obtained matrix 
	cout<<"The obtained matrix after multiplication of two matrices is given below: "<<endl;
	for(int a=0;a<row_1;a++)
	{
		for(int b=0;b<col_2;b++)
		{
			cout<<setw(6)<<left<<prod_arr[a][b];
		}
		cout<<endl;
	}
	return 0;
}