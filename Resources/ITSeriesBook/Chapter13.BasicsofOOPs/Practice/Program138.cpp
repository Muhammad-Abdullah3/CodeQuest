/*Write a class that contains two integer data members which are initialized to 100 when
an object is created. It has member function avg that displays average of data members.*/
#include<iostream>
using namespace std;
class Nmbr
{
    private:
        int x, y;
    public:
        Nmbr()
        {
            x = y = 100;
        }
        void avg()
        {
            cout<<"Average of two variables = "<<(x+y)/2;
        }
};
int main()
{
    Nmbr oneNum;
    oneNum.avg();
    return 0;
}