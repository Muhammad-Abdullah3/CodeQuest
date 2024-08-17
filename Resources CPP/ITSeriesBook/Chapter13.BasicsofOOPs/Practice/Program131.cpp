/*Write a program that declares a class with one integer data member and two member 
function in() and out() to input and output data in data member.*/
#include<iostream>
using namespace std;
class First
{
    private:
    int a;
    public:
    void in()
    {
        cout<<"Enter an integer: ";
        cin>>a;
    }
    void out()
    {
        cout<<a<<" is the data member.";
    }
};
int main()
{
    First my;
    my.in();
    my.out();
    return 0;
}