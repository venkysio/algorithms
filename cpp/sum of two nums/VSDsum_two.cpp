#include <iostream>
using namespace std;


void VSDsum_two(int a,int b){
    cout<<"sum of "<<a<<" and "<<b<<" is "<<a+b;
}
int main() {
    cout<<"enter first num ";
    int a,b;
    cin>>a;
    cout<<endl;
    cout<<"enter second num ";
    cin>>b;
    VSDsum_two(a,b);
    return 0;
}