#include <iostream>
#include <queue>
using namespace std;


int VSDmin_heap(int arr[],int len){
     priority_queue<int,vector<int>,greater<int>>VSDminh;
     for(int i=0;i<len;i++){
         VSDminh.push(arr[i]);
     }
     cout<<"This is the requird min heap ";
     for(int i=0;i<len;i++){
         cout<<minh.top()<<" ";
         VSDminh.pop();
     }
     
}
int main() {
    int n;
    cout<<"enter no of elements in array ";
    cin >>n;
    int arr[n];
    cout<<"enter elements in the array";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    VSDmin_heap(arr,n);

    return 0;
}