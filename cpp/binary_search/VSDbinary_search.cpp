#include <iostream>
using namespace std;  

int VSDbinary_search(int arr[],int ele,int end ,int start){
    int itr;    
    if(end >= start)     
    {  
        itr = (start + end)/2; //taking middle value
		if(arr[itr]==ele){
        return itr;
    }
    else if (arr[itr]>ele){
        return VSDbinary_search(arr,ele,itr,start);
    }
    else if (arr[itr]<ele){
        return VSDbinary_search(arr,ele,end,itr);
    }
    }
    
    else{
        return -1;
    }
}

int main() {
    int n;
    cout<<"enter no of elements in array ";
    cin >>n;
    int arr[n];
    cout<<"enter elements in sorted order ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int ele;
    cout<<"enter element to search ";
    cin >>ele;
    int result = VSDbinary_search(arr,ele,n,0);
    if(result==-1){
        cout<<"element does not exist";
    }
    else{
        cout<<"elemen present at index "<<result;
    }  
    return 0;
}