/*Write a class Book with three data members BookID, Pages and Price. It also contains the 
following member function.
1- The get funciton is used to input values.
2- The show function is used to display values.
3- The set function is used to set the values of data members using parameter
4- The get price function is used to return the value of price.

The program should createtwo objects of the class and input values for these objects. 
The program displays the details of the most costly book.
*/
#include<iostream>
using namespace std;
class Book
{
    private:
    int bookId, pages;
    float price;
    public:
    void get()
    {
        cout<<"Enter the Book Id: ";cin>>bookId;
        cout<<"Enter the Book Pages: ";cin>>pages;
        cout<<"Enter the Book Price: ";cin>>price;
    }
    void show()
    {
        cout<<"Book Id:"<<bookId<<endl;
        cout<<"Book Pages:"<<pages<<endl;
        cout<<"Book Price:"<<price<<endl;
    }
    void set(int id,int pg,float pr)
    {
        bookId = id;
        pages = pg;
        price = pr;
    }
    float getPrice()
    {
        return price;
    }
};
int main()
{
    Book b1;
    b1.get();
    b1.set(01,566,870.65);
    Book b2;
    b2.get();
    b2.set(10,438,180.70);
    cout<<"Most Costly book:";
    if(b1.getPrice()<b2.getPrice())
        b2.show();
    else
        b1.show();
    return 0;
}
