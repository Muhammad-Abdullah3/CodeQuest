#include<iostream>
#include<iomanip>
#include<string>
using namespace std;
struct student
{
    int rollNo;
    float marks[6];
    float average;
    char grade;
};
int main()
{
    student Zaryab;
    cout<<"Enter Roll No:";
    cin>>Zaryab.rollNo;
    cout<<"Enter Marks:";
    for(int i=0;i<6;i++)
        cin>>Zaryab.marks[i];
    // summing all marks
    float sum=0;
    for(int i=0;i<6;i++)
        sum+=Zaryab.marks[i];
    Zaryab.average = sum/6;
    if(Zaryab.average>=80&&Zaryab.average<=100)
        Zaryab.grade  = 'A';
    else if(Zaryab.average>=70&&Zaryab.average<80)
        Zaryab.grade  = 'B';
    else if(Zaryab.average>=60&&Zaryab.average<70)
        Zaryab.grade  = 'C';
    else if(Zaryab.average>=50&&Zaryab.average<60)
        Zaryab.grade  = 'D';
    else
        Zaryab.grade = 'F';
    cout<<"Result Card of Student:"<<endl;
    cout<<setw(20)<<left<<"Roll No:"<<setw(20)<<left<<"Total Marks"<<setw(20)<<left<<"Obtained Marks"<<setw(20)<<left<<"Average"<<setw(20)<<left<<"Grade"<<endl;
    cout<<setw(20)<<left<<Zaryab.rollNo<<setw(20)<<left<<"600"<<setw(20)<<left<<sum<<setw(20)<<left<<Zaryab.average<<setw(20)<<left<<Zaryab.grade<<endl;
    return 0;
}