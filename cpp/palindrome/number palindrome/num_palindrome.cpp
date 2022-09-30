
#include <iostream>
using namespace std;


void check_palindrome(int n){
    int rem,sum=0;
    int temp=n;
    while(n>0){
        rem=n%10;
        sum=sum*10+rem;
        n=n/10;
    }
    if(sum==temp){
        cout<<temp<<" is a palindrome number";
    }
    else{
        cout<<temp<<" is not a palindrome number";
    }
}
int main() {
    cout<<"enter a number to check palindrome ";
    int n;
    cin>>n;
    cout<<endl;
    check_palindrome(n);
    return 0;
}