#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    //First array with (data type)[array_name][size] = {value1,value2}
    int fir_ar[5]={12,32,34,10,9}; //An array of integer data type with size of 5  
    //Displaying the array using loop
    for(int i=0;i<5;i++)
    {
        cout<<fir_ar[i]<<endl;
    }
    getch();
    return 0;
}