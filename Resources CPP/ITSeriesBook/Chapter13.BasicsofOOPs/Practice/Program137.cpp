/* Write a class that displays a simple message on the screen whenever an object
of that class is created. 
*/
#include<iostream>
using namespace std;
class Cons
{
    private:
        int age;
    public:
    Cons()
    {
        cout<<"Hello new object."<<endl;
    }
    void inAge()
    {
        cout<<"Enter your age:";
        cin>>age;
    }
};
int main()
{
    Cons new1;
    new1.inAge();
    Cons new2;
    return 0;
}