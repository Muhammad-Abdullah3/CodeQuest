#include<iostream>
#include<string>
#include<datetimeapi.h>
#include<fstream>
class User
{
    void sleepTime();
    private:
    string name;
    string date;
    string startTime;
    string endTime;
    public:
    void input()
    {
        cout<<"Enter your name:";
        getline(cin,name);
        cout<<"Enter Date:";
        getline(cin,date);
    }
    void sleepTime()
    {
        char choice;
        cout<<"\nChose Sleep Start Time:";
        cout<<"\na- 09:00 PM\tb- 09:15 PM\tc- 09:30 PM\tb- 09:45 PM\td- 10:00 PM";
        cout<<"\ne- 10:15 PM\tf- 10:30 PM\tg- 10:45 PM\th- 11:00 PM\ti- 11:15 PM";
        cout<<"\nj- 11:30 PM\tk- 11:45 PM\tl- 12:00 AM";
        cin>>choice;
        switch(choice)
        {
            case 'a': case 'A':
                startTime = "9:00 PM";
                break;
            case 'b': case 'B':
                startTime = "9:15 PM";
                break;
            case 'c': case 'C':
                startTime = "9:30 PM";
                break;
            case 'd': case 'D':
                startTime = "9:45 PM";
                break;
            case 'e': case 'E':
                startTime = "10:00 PM";
                break;
            case 'f': case 'F':
                startTime = "10:15 PM";
                break;
            case 'g': case 'G':
                startTime = "10:30 PM";
                break;
            case 'h': case 'H':
                startTime = "10:45 PM";
                break;
            case 'i': case 'I':
                startTime = "11:00 PM";
                
                break;
            case 'j': case 'J':
                startTime = "11:15 PM";
                break;
            case 'k': case 'K':
                startTime = "11:30 PM";
                break;
            case 'l': case 'L':
                startTime = "11:45 PM";
                break;
            case 'm': case 'M':
                startTime = "12:00 AM";
                break;
            
        }
    }
};
int main()
{
    return 0;
}