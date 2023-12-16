#include<iostream>
#include<conio.h>
using namespace std;

int main() {
    int n;

    // Get the number of rows for the pyramid
    cout << "Enter the number of rows: ";
    cin >> n;

    // Outer loop for the number of rows
    for (int i = 1; i <= n; i++) {
        // Inner loop for printing spaces
        for (int j = 1; j <= n - i; j++) {
            cout << " ";
        }
        // Inner loop for printing asterisks
        for (int k = 1; k <= i; k++) {
            cout << "*";
        }
        // Move to the next line after printing each row
        cout << endl;
    }
	getch();
    return 0;
}