#include<iostream>
using namespace std;
struct Birthdate
{
    int day,month,year;
};
int main()
{
    Birthdate meri;
    cout<<"Enter day: ";
    cin>>meri.day;
    cout<<"Enter month: ";
    cin>>meri.month;
    cout<<"Enter year: ";
    cin>>meri.year;
    cout<<"\nUser DOB:"<<meri.day<<"/"<<meri.month<<"/"<<meri.year;
    return 0;
}