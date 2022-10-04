#include <iostream>
using namespace std;
void swap(int &a,int &b){
    int c=a;
    a=b;
    b=c;
}

void insertion_sort(int arr[],int len){
     
     int temp,j;
     for(int i=1;i<len;i++){
         temp=arr[i];
         j=i;
         while(j>0&&arr[j-1]>temp){
             arr[i]=arr[j-1];
             j--;
         }
         arr[j]=temp;
     }
     cout<<"The sorted array using insertion sort is  ";
     for(int i=0;i<len;i++){
         cout<<arr[i]<<" ";
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
    insertion_sort(arr,n);

    return 0;
}
