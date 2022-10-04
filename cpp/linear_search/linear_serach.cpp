#include <iostream>
using namespace std;  

int linear_search(int arr[],int ele,int len){
    int iter=0;
    while(iter<len){
        if(arr[iter]==ele){
            return iter;
        }
        iter++;
    }
    if(iter==len){
        return -1;
    }
}

int main() {
    int n;
    cout<<"enter no of elements in array ";
    cin >>n;
    int arr[n];
    cout<<"enter elements in to the array ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int ele;
    cout<<"enter element to search ";
    cin >>ele;
    int result = linear_search(arr,ele,n);
    if(result==-1){
        cout<<"element does not exist";
    }
    else{
        cout<<"elemen present at index "<<result;
    }  
    return 0;
}