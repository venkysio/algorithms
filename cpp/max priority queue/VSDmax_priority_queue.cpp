#include <iostream>
#include <queue>
using namespace std;
int main() {
    priority_queue<int>VSDmaxpq;
    cout<<"checking for queue empty "<<"\n";
    if(VSDmaxpq.empty()){
        cout<<"queue is empty"<<"\n";
    }
    else{
        cout<<"queue is not empty"<<"\n";
    }
    cout<<"Enter an element to push in to queue";
    int n;
    cin>>n;
    VSDmaxpq.push(n);
    cout<<"element pushed in to queue"<<"\n";
    cout<<"checking for top of element"<<endl;
    cout<<"top of the element is "<<VSDmaxpq.top()<<endl;
    cout<<"Enter another element to push in to queue";
    int n1;
    cin>>n1;
    VSDmaxpq.push(n1);
    cout<<"element pushed in to queue"<<"\n";
    cout<<"checking for top of element"<<endl;
    cout<<"top of the element is "<<VSDmaxpq.top()<<endl;
    cout<<"checking size of queue"<<endl;
    cout<<"size of queue is "<<VSDmaxpq.size()<<endl;
    cout<<"poping of the element"<<endl;
    cout<<"the poped element is"<<VSDmaxpq.top();
    VSDmaxpq.pop();
    cout<<"checking size of queue"<<endl;
    cout<<"size of queue is "<<VSDmaxpq.size()<<endl;
    return 0;
}