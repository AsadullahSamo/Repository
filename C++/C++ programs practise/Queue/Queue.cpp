#include<iostream>
#include<queue>
using namespace std;
void printqueue(queue<int> queue){
	while(!queue.empty())
	{
		cout<<queue.front()<<"  ";
		queue.pop();         // used to remove element at start of queue
	} // end of while
	cout<<endl;
}
int main(){
	 queue<int> Myqueue;
	 Myqueue.push(1);       // used to add element at end of queue
	 Myqueue.push(2);
	 Myqueue.push(3);
	 Myqueue.push(4);
//	 Myqueue.pop();         // it will remove 1 from queue
//	 Myqueue.pop();         // it will remove 2 from queue
	 Myqueue.push(6);         // it will add 6 at the end of queue
	 cout<<"Size of queue is "<<Myqueue.size()<<endl;
	 cout<<"First element of queue is "<<Myqueue.front()<<endl;
	 cout<<"Last element of queue is "<<Myqueue.back()<<endl;
	 
	 printqueue(Myqueue);
	 cout<<endl;
	return 0;
}
