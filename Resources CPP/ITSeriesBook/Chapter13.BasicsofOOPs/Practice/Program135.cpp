/*Write a class Result that contains roll no, name and marks of three subjects. The marks are stored in an 
array of integers. The class also contain following member functions.
1- The input() function is used to input the values in data members.
2- The show function is used to displays the value of data member.
3- The total function returns total marks of a student.
4- The avg function returns the average marks of a student.
The program should create an object of the class and call the member functions.
*/
#include<iostream>
#include<string>
using namespace std;
class Result
{
    private:
    int rNo,marks[3];
    string name;
    public:
    void input()
    {
        cout<<"Enter the name of student:";
        getline(cin,name);
        cout<<"Enter the roll number:";
        cin>>rNo;
        cout<<"Enter the marks for the student:";
        for(int i=0;i<3;i++)
            cin>>marks[i];
    }
    void show()
    {
        cout<<"Name of the student: "<<name<<endl;
        cout<<"Roll No of Student: "<<rNo<<endl;
        for(int i=0;i<3;i++)
            cout<<"Marks"<<i<<" :"<<marks[i]<<endl;
    }
    int total()
    {
        int tot=0;
        for(int i=0;i<3;i++)
            tot += marks[i];
        return tot;
    }
    float avg()
    {
        int tot = total();
        return (tot/3);
    }
};
int main()
{
    Result st1;
    st1.input();
    st1.show();
    cout<<"Total marks: "<<st1.total()<<endl;
    cout<<"Average: "<<st1.avg();
    return 0;
}