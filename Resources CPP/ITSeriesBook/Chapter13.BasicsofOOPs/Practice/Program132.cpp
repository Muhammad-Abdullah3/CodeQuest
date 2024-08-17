#include<iostream>
using namespace std;
class Marks
{
    private:
    int m1,m2,m3;
    public:
    void in()
    {
        cout<<"Enter marks of three subjects: ";
        cin>>m1>>m2>>m3;
    }
    int sum()
    {
        return m1+m2+m3;
    }
    float avg()
    {
        float avg = sum()/3;
        return avg;
    }

};
int main()
{
    Marks zaryab;
    zaryab.in();
    cout<<zaryab.sum()<<endl;
    cout<<zaryab.avg()<<endl;
    return 0;
}