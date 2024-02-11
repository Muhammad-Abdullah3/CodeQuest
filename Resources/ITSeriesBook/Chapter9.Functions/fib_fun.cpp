#include<iostream>
using namespace std;
void fib_series(int num)
    {
    int fib=0,count,fib_1=1;
    count=num;
    //using for loop to get value of fib(n-2)

    for (int i=1;i<=count;i++)
    {
        if(num==1)
        {
            fib = 0;
        }
        else if (num==2)
        {
            fib = 1;
        }
        else
        {
			if(i==1)
			{	          
        	fib_1 =0;
        	fib += fib_1;
			}
			else if(i==2)
			{	          
        	fib_1 =1;
        	fib += fib_1;
			}
			else
			{ 
        	fib_1 = fib;
        	fib += fib_1;
			}
        }
    }
    cout<<num<<"th term of fibbonacci = "<<fib;
}
int main()
{
    fib_series(7);
    return 0;
}
