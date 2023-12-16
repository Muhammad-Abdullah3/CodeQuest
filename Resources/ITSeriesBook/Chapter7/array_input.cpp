#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    //First array with (data type)[array_name][size] = {value1,value2}
    int ar_1[5]; //An array of integer data type with size of 5  
    //Getting input of the array using loop
    cout<<"Enter the values to store in the 1D array:";
    for(int i=0;i<5;i++)
    {
        cin>>ar_1[i];
    }
    //Displaying the input values
    cout<<"Values of the array are listed as follows:\n";
    for(int j=0;j<5;j++)
    {
        cout<<ar_1[j]<<endl;
    }
    getch();
    return 0;
}