/*Write a class Student that has marks and grade as data members. A constructor with 
two parameters initializes data members with the given values and member function show()
displays the values of data members. Create two objects and display the values.
*/
#include<iostream>
using namespace std;
class Student
{
    private:
        int num;
        char ch;
    public:
        Student(int x, char y)
        {
            num = x;
            ch = y;
        }
        void show()
        {
            cout<<"The number entered by user is: "<<num<<endl;
            cout<<"The character entered by user is: "<<ch<<endl;
        }
};
int main()
{
    Student st1(135,'a');
    st1.show();
    return 0;
}