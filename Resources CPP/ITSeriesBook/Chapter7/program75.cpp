/*Write a program that inputs the age of different persons and counts the number of persons in the
age group of 50 and 60
*/
#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int to_per;//Total number of persons under consideration
    cout<<"Enter the number of persons required: ";
    cin>>to_per;
    int per_age[to_per];//Array to store age of all persons
    int count =0; //Variable to count total number of persons in specified age group
    for (int i=0;i<to_per;i++)
    {
        //Getting the input of different persons and storing them in the array
        cout<<"Enter the age of Person "<<i+1<<":";
        cin>>per_age[i];
        //Incrementing the count variable everytime age group is 50 and 60
        if (per_age[i]>=50&&per_age[i]<70)
            count++;
    }
    cout<<"Total persons in age group of 50 and 60 are: "<<count;
    getch();
    return 0;
}