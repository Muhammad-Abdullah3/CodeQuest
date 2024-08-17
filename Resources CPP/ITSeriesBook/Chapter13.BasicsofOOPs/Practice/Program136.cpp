/*Write a class Array that contains an array of integers to store five values. It also contains
the following member functions defined outside the class.
1- The fill() function is used to fill the array with the values of array
2- the display() function is used ot dispaly the values of array
3- The max() function shows the maximum value in the array
4- The min() function shows the minimum value in the array
*/
#include<iostream>
using namespace std;
class Array
{
    private:
        int a[5];
    public:
        void fill();
        void display();
        int max();
        int min();
};
void Array::fill()
{
    for(int i=0;i<5;i++)
    {
        cout<<"Enter the value of a["<<i<<"] :";
        cin>>a[i];
    }
}
void Array::display()
{
    for(int i=0;i<5;i++)
    {
        cout<<"Value of a["<<i<<"]: "<<a[i]<<endl;
    }
}
int Array::max()
{
    int max = a[0];
    for(int i=0;i<5;i++)
    {
        if(a[i]>max)
            max = a[i];    
    }
    return max;
}
int Array::min()
{
    int min = a[0];
    for(int i=0;i<5;i++)
    {
        if(a[i]<min)
            min = a[i];    
    }
    return min;
}
int main()
{
    Array arr;
    arr.fill();
    arr.display();
    cout<<"Maximum value in the array:"<<arr.max()<<endl;
    cout<<"Minimum value in the array:"<<arr.min();
    return 0;
}