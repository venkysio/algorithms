#include <iostream>
using namespace std;


void VSDcheck_prime(int n){
    if(n==0 || n==1){
        cout<<n<<" is a prime number";
    }
    else{
        int ptr=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                cout<<n<<" is not a prime number";
                ptr=0;
                break;
                
            }
            
        }
        if(ptr){
            cout<<n<<" is a prime number";        }
        
    }
}
int main() {
    cout<<"enter a number to check prime ";
    int n;
    cin>>n;
    cout<<endl;
    VSDcheck_prime(n);
    return 0;
}