#include <iostream>
#include <queue>
using namespace std;


int VSDmax_heap(int arr[],int len){
     priority_queue<int>VSDmaxh;
     for(int i=0;i<len;i++){
         VSDmaxh.push(arr[i]);
     }
     cout<<"This is the requird max heap ";
     for(int i=0;i<len;i++){
         cout<<maxh.top()<<" ";
         VSDmaxh.pop();
     }
     
}
int main() {
    int n;
    cout<<"enter no of elements in array ";
    cin >>n;
    int arr[n];
    cout<<"enter elements in the array ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    VSDmax_heap(arr,n);

    return 0;
}