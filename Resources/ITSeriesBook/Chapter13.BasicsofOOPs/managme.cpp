#include<iostream>
#include<string>
#include<time.h>
#include<stdlib.h>
using namespace std;
class Genpass
{
	private:
		string pass;
		string userName;
	public:
		Genpass()
		{
            srand(time(0));
			int totChar;
			cout<<"Enter your User Name: ";
			getline(cin,userName);
			cout<<"Enter the length of your password:";
			cin>>totChar;
            pass.resize(totChar)
			char a[50];
			for(int i= 0; i<50;i++)
				a[i] = 'A'+i;
			//Randomly accessing
			for(int i = 0;i<totChar;i++)
			{
				int ra = (rand()%50);
				pass.at(i) = a[ra];
			}
		}
		void display()
		{
			cout<<"Username: "<<userName;
			cout<<"Password"<<pass;
		}
};
int main()
{
	Genpass user1;
	return 0;
}