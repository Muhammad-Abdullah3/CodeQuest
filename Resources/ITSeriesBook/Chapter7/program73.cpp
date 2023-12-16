/*Write a program that inputs five integers from the user and stores them in an array and displays
the sum and average of these values*/
#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    //Declaring array and sum variables
    int array[5],sum;
    float avg = 0.0; //Initializing variables for average of array
    //Getting the input of array values
    for (int i=0;i<5;i++)
    {
        cout<<"Enter an integer: ";
        cin>>array[i];
        //Calculating sum
        sum = sum+array[i];
    } 
    avg = sum/5.0;
    cout<<"Sum of all values in the array = "<<sum<<endl;
    cout<<"Average of all values in the array = "<<avg<<endl;
    getch();
    return 0;
}