#include <iostream>
#include <queue>
using namespace std;
int main() {
     priority_queue<int,vector<int>,greater<int>>minpq;
    cout<<"checking for queue empty "<<"\n";
    if(minpq.empty()){
        cout<<"queue is empty"<<"\n";
    }
    else{
        cout<<"queue is not empty"<<"\n";
    }
    cout<<"Enter an element to push in to queue";
    int n;
    cin>>n;
    minpq.push(n);
    cout<<"element pushed in to queue"<<"\n";
    cout<<"checking for top of element"<<endl;
    cout<<"top of the element is "<<minpq.top()<<endl;
    cout<<"Enter another element to push in to queue";
    int n1;
    cin>>n1;
    minpq.push(n1);
    cout<<"element pushed in to queue"<<"\n";
    cout<<"checking for top of element"<<endl;
    cout<<"top of the element is "<<minpq.top()<<endl;
    cout<<"checking size of queue"<<endl;
    cout<<"size of queue is "<<minpq.size()<<endl;
    cout<<"poping of the element"<<endl;
    cout<<"the poped element is"<<minpq.top();
    minpq.pop();
    cout<<"checking size of queue"<<endl;
    cout<<"size of queue is "<<minpq.size()<<endl;
    return 0;
}