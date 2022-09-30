#include <iostream>
#include <queue>
using namespace std;
int main() {
    priority_queue<int>maxpq;
    cout<<"checking for queue empty "<<"\n";
    if(maxpq.empty()){
        cout<<"queue is empty"<<"\n";
    }
    else{
        cout<<"queue is not empty"<<"\n";
    }
    cout<<"Enter an element to push in to queue";
    int n;
    cin>>n;
    maxpq.push(n);
    cout<<"element pushed in to queue"<<"\n";
    cout<<"checking for top of element"<<endl;
    cout<<"top of the element is "<<maxpq.top()<<endl;
    cout<<"Enter another element to push in to queue";
    int n1;
    cin>>n1;
    maxpq.push(n1);
    cout<<"element pushed in to queue"<<"\n";
    cout<<"checking for top of element"<<endl;
    cout<<"top of the element is "<<maxpq.top()<<endl;
    cout<<"checking size of queue"<<endl;
    cout<<"size of queue is "<<maxpq.size()<<endl;
    cout<<"poping of the element"<<endl;
    cout<<"the poped element is"<<maxpq.top();
    maxpq.pop();
    cout<<"checking size of queue"<<endl;
    cout<<"size of queue is "<<maxpq.size()<<endl;
    return 0;
}