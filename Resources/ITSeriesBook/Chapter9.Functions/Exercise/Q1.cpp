//Write a function that converts decimal to binary
#include<iostream>
#include<string>
using namespace std;
string decToBin(int);
int main()
{
    int dec = 278;
    string binary = decToBin(dec);
    cout<<"\nBinary form of "<<dec<<" = "<<binary;
    return 0;
}
string decToBin(int a)
{
    if (a < 0) 
    {
        cout<<"Input must be a non-negative integer.";
    }

    // special case of 0
    if (a == 0) 
    {
        return "0";
    }

    string binaryResult = "";
    while (a > 0) 
    {
        binaryResult = to_string(a % 2) + binaryResult;
        // Divide the decimal number by 2 for the next iteration
        a /= 2;
    }
    return binaryResult;
}