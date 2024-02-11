#include<iostream>
using namespace std;
int gcd(int,int);
int main()
{
    int a=-1,b=396;
    //calling function
    cout<<"Greatest Common Divisor of "<<a<<" and "<<b<<" is: "<<gcd(a,b);
    return 0;
}
int gcd(int a, int b)
{
    int limit = a;
    if(a<b)
        limit = b;
    if(a<=0||b<=0)
    {
        return 0;
        exit(0);
    }
    int gr_cd = 1;
    for(int i=1;i<=limit;i++)
    {
        if((a%i==0&&b%i==0)&&(i>gr_cd))
            gr_cd = i;
    }
    return gr_cd;
}