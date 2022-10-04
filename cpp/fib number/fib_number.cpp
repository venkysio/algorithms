#include <iostream>
using namespace std;
void fib_number(int n){
    if(n==1){
        cout<<0;
    }
    else if (n==2){
        cout<<1;
    }
    else if (n>2){
        int a=0,b=1,c;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        cout<<c;
    }
    else{
        cout<<"n value must be greater than 0";
    }
}


int main() {
    cout<<"enter the element for nth fib number ";
    int n;
    cin>>n;
    cout<<"The "<<n<<" fib number of the series is ";
    fib_number(n);
    return 0;
}