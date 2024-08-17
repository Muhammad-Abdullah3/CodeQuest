/*Print the following pattern using loop
ABCDEF
BCDEFA
CDEFAB
DEFABC
EFABCD
FABCDE
*/
#include<iostream>
using namespace std;
int main()
{
    for(int i=0;i<=5;i++)
    {
        char ch = 'A'+i;
        for(int j=1;j<=6;j++)
        {
            cout<<ch;
            ch++;
            if(ch>'F')
                ch='A';
        }
        cout<<endl;
    }
    return 0;
}