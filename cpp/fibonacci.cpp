#include <iostream>
using namespace std;

int main()
 {
    int n, a = 0, b = 1, nextTerm = 0;
    cout<<" Welcome to VSDEVELOPERS \n" ;
    cout << "Enter the number of terms: ";
    cin >> n;

    cout << "Fibonacci Series: ";

    for (int i = 1; i <= n; ++i) {
        // Prints the first two terms.
        if(i == 1) {
            cout << a << ", ";
            continue;
        }
        if(i == 2) {
            cout << b << ", ";
            continue;
        }
        nextTerm = a + b;
        a = b;
        b = nextTerm;

        cout << nextTerm << ", ";
    }
    return 0;
}
