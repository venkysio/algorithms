#include <iostream>
using namespace std;
void swap(int &a,int &b){
    int c=a;
    a=b;
    b=c;
}

void bubble_sort(int arr[],int len){
     
     for(int i=0;i<len;i++){
        for(int j=0;j<len-i-1;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
            }
        }
     }
     cout<<"The sorted array using bubble sort is  ";
     for(int i=0;i<len;i++){
         cout<<arr[i]<<" ";
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
    bubble_sort(arr,n);

    return 0;
}
