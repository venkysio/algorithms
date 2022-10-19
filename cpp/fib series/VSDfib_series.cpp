#include <iostream>
using namespace std;
void VSDfib_series(int n){
    if(n==1){
        cout<<0;
    }
    else if (n==2){
        cout<<0<<" "<<1;
    }
    else if (n>2){
        int a=0,b=1,c;
        cout<<a<<" "<<b;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            cout<<c<<" ";
            
        }
    }
    else{
        cout<<"n value must be greater than 0";
    }
}


int main() {
    cout<<"enter the element for lenght of serie s ";
    int n;
    cin>>n;
    cout<<"The fib series of len "<<n<<" is"<<endl;
    VSDfib_series(n);
    return 0;
}