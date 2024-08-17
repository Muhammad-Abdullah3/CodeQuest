/* Write a program that inputs current day and month from the user. It then calculates the total
number of days in the current year untill the entered date.
*/
#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
    int day,month,total;
    int day_per_month[12]={31,28,31,30,31,30,31,31,30,31,30,31};
    cout<<"Enter the number of month: ";
    cin>>month;
    cout<<"Enter the day: ";
    cin>>day;
    total = day;
    for (int x = 0;x<month-1;x++)
    {
        total += day_per_month[x];
    }
    cout<<"The number of days passed untill the date entered in the year are: "<<total;
    getch();
    return 0;
}